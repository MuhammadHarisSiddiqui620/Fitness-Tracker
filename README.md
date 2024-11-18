# Fitness Tracker

## Table of Contents
1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
2. [Schema](#Schema)

## Overview
### Description
Allows users to create profiles to track their fitness goals. This is a self reporting fitness app that will allow the user to input their workout history and track their activity. User will be displayed analytics based on the amount of input of workout history recorded into the app. Learn new workouts, or even for beginners to get started. 

### App Evaluation
[Evaluation of your app across the following attributes]
- **Category:** Fitness 
- **Mobile:** This app would differ from a glorified website by creating a easy to use interface that would quickly provide data to the user
- **Story:** The value on the app will vary on users. The app would be particularly useful for those who like to keep track of their progress. It would also be useful for those who work out frequently. We feel that peers who workout would react positively to this app as it would serve to be a useful tool for them. 
- **Market:** This app will appeal to users who typically like to see their past workouts. Also those who like to track their history and see the progression over time
- **Habit:** Depending on the users workout schedule. The user will be creating data to track their workouts, and the user will also be able to view videos on specific workouts. The user will be able to create posts, so friends could also view thei fitness progress.
- **Scope:** We already have most of the resources to create a barebones version, but the challenging aspect to this is learning how to use new API's and new libraries.

## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-have Stories**
User to sign up
- [x] name, username, password,wt,ht
    
User to login
- [x] username
- [x] password

Profile Screen
- [x] username, ht, weight(maybe?)

User to home screen
- [x] display past days workouts
- [x] display total burned calories over a given duration

Have a workout activity page that will begin to track the users activities. 
- [x] This will have a checkbox for the premade list of exercises. 
- [X] a start/stop button(starts timer)
- [x] Finish button should go to summary
- [x] In summary, calculated calories should be displayed


In workout screen
- [x] display timer(to calc burned calories)
- [x] display select workout
- [x] workout completed button -> display calorie and time results. W/ a positive message. Close screen back to home page.
 
### 2. Screen Archetypes

* Login / Register
    * After Login and Registration, User is then moved to the home screen
* Stream
    * Home screen will be a dashboard interface, that will display certain data such as past workouts and calories burnt
    * Social media aspect will display the workout of friends
* Creation
    * The user will be inputing data based on the workout they're completing/tracking. The input will then be saved so that the user could view their progress. 
    * The user will also have the option to post their workouts for others to see. This feature may be presented once the user has finished inputting data from their workout
* Detail
    * This will be used when displaying data to the user, such as calories burned, distance walked, 


### 3. Navigation

**Tab Navigation** (Tab to Screen)

* Login
* Profile
* Home Screen
* Workout Activity
    * workout

**Flow Navigation** (Screen to Screen)

* Login Screen
    * --> Home
* Registration screen
    * --> Home
* Homescreen
    * --> provide data to the user using a Detail Screen Archetypes once one of the charts get clicked on
    * --> provide the friends feed to the user, might be implemented on another activity

## Schema 
### Models
#### User

   | Property      | Type     | Description |
   | ------------- | -------- | ------------|
   | objectId      | String   | unique id for the user post (default field) |
   | author        | Pointer to User| image author |
   | image         | File     | profile image |
   | Weight       | Number   | weight of the user thats inputted during sign up |
   | Height | String   | Height of the user thats inputted during sign up |
   | Password    | String   | Password |
   | Username     | String | username used to sign in |
   | lastWorkout | Pointer to Workout | Date & time of last workout |
   | Email | String | email for user
   | createdAt | DateTime | date and time when profile created
   
#### Workout

   | Property      | Type     | Description |
   | ------------- | -------- | ------------|
   | object ID | String | unique id for the workout
   | createdAt | DateTime | date and time when the workout was initialized
   | start | DateTime | time when the workout was started
   | end | DateTime |time when the workout was completed
   | duration | String | calculated from start and end to display total time of workout
   | WorkoutType | String | name of the specific workout
   | Calories | Number | Carlories burned for the workout

