# Better Stetho

## What is Better Stetho?
Better Stetho is written on the top of Facebook Stetho library.

### Usages
Stetho is very useful tool to debug Network APis and Shared Preferences, but developer must need to disable it from the production build each time for security concern. But APK or AAB always contains the whole source code of Stetho and so increase approx. half MB in APK size. But

Better Stetho only integrate in Project source code for Debug build only and automatically detached for Release build.

To check how it works, please go through the app module.

### Libraries integrated-
[Stetho](http://facebook.github.io/stetho/)
[Retrofit](https://square.github.io/retrofit/)
[Volley](https://developer.android.com/training/volley/index.html)
[]

#### How to use
Project level `build.gradle`
```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

App level `build.gradle`
```groovy
debugImplementation 'com.github.FantasticAndroid.BetterStetho:StethoDebugLib:2.0'
releaseImplementation 'com.github.FantasticAndroid.BetterStetho:StethoReleaseLib:2.0'
```
#### Initialize Stetho by calling
```kotlin
RetroUtil.initStethoAccordingly(this) /*This will enable Stetho for Debug Build for All Retro/Volley and Other Inspection*/
```
##### Take a look into app module for Retrofit and Volley ApiClient and Api Calling process.
