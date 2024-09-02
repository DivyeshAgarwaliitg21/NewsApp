package com.adiv.newsapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.lifecycleScope
import com.adiv.newsapp.domain.usecases.AppEntryUseCases
import com.adiv.newsapp.navigation.NavGraph
import com.adiv.newsapp.ui.theme.NewsAppTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @Inject
    lateinit var appEntryUseCases: AppEntryUseCases
    val viewModel by viewModels<MainViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen().apply {
            setKeepOnScreenCondition{
                viewModel.splashCondition.value
            }
        }
        lifecycleScope.launch {
            appEntryUseCases.readAppEntry().collect{
                Log.d("Test", it.toString())
            }
        }
        setContent {
            NewsAppTheme {

//                val isSystemDarkMode= isSystemInDarkTheme()
//                val systemController= rememberSystemUiController()
//
//                SideEffect {
//                    systemController.setSystemBarsColor(
//                        color = Color.Transparent,
//                        darkIcons = !isSystemDarkMode
//                    )
//                }

                Box(modifier = Modifier.background(MaterialTheme.colorScheme.background)){
                    val startDestination= viewModel.startDestination
                    NavGraph(startDestination = startDestination)
                }
            }
        }
    }
}
