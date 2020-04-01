# Uber Car Animation Android - An example project to demonstrate how to Add Uber Like Car Animation in Android App
[![MindOrks](https://img.shields.io/badge/mindorks-opensource-blue.svg)](https://mindorks.com/open-source-projects)
[![MindOrks Community](https://img.shields.io/badge/join-community-blue.svg)](https://mindorks.com/join-community)

<p align="center">
    <img src="https://github.com/MindorksOpenSource/Uber-Car-Animation-Android/blob/master/assets/how-to-add-uber-car-animation-in-android-app-banner.jpg">
</p>
<br>

## About this Open Source Project  
This project contains a sample app that shows how to animate the car icon of Uber app from a Source to a Destination on Google Map.

## Screenshots from this project

<p align="center">
  <img src="https://github.com/MindorksOpenSource/Uber-Car-Animation-Android/blob/master/assets/how-to-add-uber-car-animation-in-android-app-draw-path.jpg" width="250">
  <img src="https://github.com/MindorksOpenSource/Uber-Car-Animation-Android/blob/master/assets/how-to-add-uber-car-animation-in-android-app-moving-car.jpg" width="250">
  <img src="https://github.com/MindorksOpenSource/Uber-Car-Animation-Android/blob/master/assets/how-to-add-uber-car-animation-in-android-app-gif.gif" width="250">
</p>
<br>

## Building the project
* Clone the project, the `master` branch has the latest code.
* This App uses the Google API Key for Maps. Get the API key from the Google Cloud Developer console after enabling the Maps feature for your project. Refer this [link](https://developers.google.com/maps/documentation/directions/get-api-key). And put that API key in the `AndroidManifest.xml` file in your project:
The `meta-data` tag of `AndroidManifest.xml` file will like below:
```
<meta-data
            android:name="com.google.android.geo.API_KEY"
            android:value="PASTE_YOUR_API_KEY_HERE" />
```

## Explore Course - "Ride-Sharing Uber Lyft Android App"  
[Learn how to build a ride-sharing Android Taxi Clone App like Uber, Lyft using basic MVP Architecture](https://bootcamp.mindorks.com/android-training-for-beginners)