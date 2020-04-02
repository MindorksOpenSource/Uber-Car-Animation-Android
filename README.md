# Uber Car Animation Android - An example project to demonstrate how to Add Uber Like Car Animation in Android App
[![MindOrks](https://img.shields.io/badge/mindorks-opensource-blue.svg)](https://mindorks.com/open-source-projects)
[![MindOrks Community](https://img.shields.io/badge/join-community-blue.svg)](https://mindorks.com/join-community)

<p align="center">
    <img src="https://github.com/MindorksOpenSource/Uber-Car-Animation-Android/blob/master/assets/how-to-add-uber-car-animation-in-android-app-banner.jpg">
</p>
<br>

## About this Open Source Project  
This project contains a sample app that shows how to animate the car icon of Uber app from a Source to a Destination on Google Map. We will build the following in this project:  
* Use Google Map to draw path from Origin to Destination
* Use list of locations to draw a path between Origin and Destination just like Uber
* Use list of location to update car location 
* Use LinearInterpolator for animation
* Draw one path of two colours i.e. grey and black
* Animate the black path from Origin to Destination just like Uber application
* Animate the car icon just like Uber application

## Screenshots from this project

<p align="center">
  <img src="https://github.com/MindorksOpenSource/Uber-Car-Animation-Android/blob/master/assets/how-to-add-uber-car-animation-in-android-app-draw-path.jpg" width="250">
  <img src="https://github.com/MindorksOpenSource/Uber-Car-Animation-Android/blob/master/assets/how-to-add-uber-car-animation-in-android-app-moving-car.jpg" width="250">
  <img src="https://github.com/MindorksOpenSource/Uber-Car-Animation-Android/blob/master/assets/how-to-add-uber-car-animation-in-android-app-gif.gif" width="250">
</p>
<br>

## Building the project
* Clone the project, the `master` branch has the latest code.
* This App uses the Google API Key for Maps. Get the API key from the Google Cloud Developer console after enabling the Maps feature for your project. Refer this [link](https://developers.google.com/maps/documentation/directions/get-api-key) and put that API key in the `AndroidManifest.xml` file in your project:
The `meta-data` tag of `AndroidManifest.xml` file will look like below:
```
<meta-data
            android:name="com.google.android.geo.API_KEY"
            android:value="PASTE_YOUR_API_KEY_HERE" />
```

## Step by Step guide  
Reference blog for this project - [How to Add Uber Car Animation in Android App](https://blog.mindorks.com/how-to-add-uber-car-animation-in-android-app)

## Explore Android Online Tutorials and Courses To Learn More by MindOrks
* [Ride-Sharing Uber Lyft Android App](https://github.com/MindorksOpenSource/ridesharing-uber-lyft-app) - Learn to build a ride-sharing Android Taxi Clone App like Uber, Lyft - Open-Source Project By MindOrks
* [Android Tutorial](https://mindorks.com/android-tutorial) - All Free Android Tutorials by MindOrks
* [Android Online Course for Professionals](https://bootcamp.mindorks.com) - In this online course, you’ll learn the Dagger, Kotlin, RxJava, MVVM Architecture, Architecture Components, Jetpack, LiveData, ViewModel, Room Database, Database Design, Multithreading, Memory Management, Networking, Caching, How Glide works, Unit Testing, and the best practices for Android Development. By the end of this online course, you will have all the skills you need to become a professional Android Developer.
* [Android Online Course for Beginners](https://bootcamp.mindorks.com/android-training-for-beginners) - This course is for beginners for those who want to get started with Android Development. In this course, you will build two apps: TodoNotes and Ride-Sharing Uber Android App.

### Find this project useful ? :heart:

* Support it by clicking the :star: button on the upper right of this page. :v:

### License
```
   Copyright (C) 2020 MINDORKS NEXTGEN PRIVATE LIMITED

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```
