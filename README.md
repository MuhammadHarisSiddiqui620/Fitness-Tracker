# Fitness Tracker

## Table of Contents
1. [Overview](#Overview)
1. [App Flow](#App-Flow)
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

## App Flow

User to sign up
- [x] Collect essential details: name, username, password, weight, height.

User to login
- [x] Login with username and password.

User to Home Screen
 - [x] Display past workout logs including exercises, sets, and dates.
 - [x] Show total calories burned over a selectable time period (daily/weekly/monthly).

Workout Activity Tracking Page
 - [x] Display a pre-set list of exercises the user can select from.
 - [x] Provide a timer that users can start/stop during their workout session.
 - [x] "Finish" button redirects to summary screen with workout details.
 - [x] Summary screen shows calories burned and time spent on each exercise, with an option to save the workout.

Workout Screen
 - [x] Show a real-time timer to track workout duration and calories burned.
 - [x] Allow users to select the type of workout they're performing (e.g., running, weightlifting).
 - [x] Include a button to mark the workout as completed, display a positive message with the summary, then close and return to the home screen.
 
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

