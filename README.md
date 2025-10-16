# 🌳 EcoAI - Green Lifestyle Companion

**EcoAI** is a mobile application developed to empower users to take tangible actions toward a more sustainable lifestyle. We combine **Artificial Intelligence (AI)** with personal tracking features to monitor environmental impact.

The application is built entirely using **Android Studio** and leverages **Google Firebase** as the backend for robust scalability and real-time data synchronization.

## ✨ Key Features

| Feature | Description | Firebase Database Used |
| :--- | :--- | :--- |
| **Daily Carbon Footprint Tracker** | Records daily activities (transportation, energy consumption, food) and calculates the estimated carbon footprint in real-time. | **Firestore** (for structured daily logs/transactions) | **Firestore** (to store user profiles and recommendation models) | **Realtime Database** (for instant score updates and rapid synchronization) |
| **Challenges & Streaks** | Users can join weekly green challenges and track their streaks to maintain good habits. | **Firestore** (for challenge data and progress tracking) |
| **User Authentication** | Secure sign-up and login using Firebase Authentication. | **Firebase Auth** |

## 🛠️ Tech Stack & Dependencies

This project is built on the native Android platform with a cloud-based backend infrastructure.

  * **Platform:** Android (Minimum SDK: 24 / Android 7.0)
  * **IDE:** Android Studio
  * **Language:** Kotlin
  * **Database:**
      * **Cloud Firestore:** Used for complex, structured data (user profiles, daily carbon logs, post data).
      * **Firebase Realtime Database:** Used for features requiring high-speed, real-time synchronization (Community Leaderboard, instant notifications).
  * **Additional Cloud Services:**
      * Firebase Authentication (for user management)
  * **Libraries:** 
      * `com.google.firebase:firebase-firestore-ktx`
      * `com.google.firebase:firebase-database-ktx`
      * `com.google.firebase:firebase-auth-ktx`

## 🚀 Installation & Setup

Follow these steps to get the EcoAI application running in your local development environment.

### Prerequisites

  * Android Studio
  * An Android Device or Emulator
  * A Google Firebase Account

### 1\. Clone the Repository

```bash
git clone https://github.com/Visella/EcoAI.git
cd EcoAI
```

### 2\. Setup Firebase Project

This application heavily relies on Firebase. You must link this Android Studio project to your own Firebase project.

1.  Open the **Firebase Console** and create a new project (e.g., `eco-ai-app`).
2.  Add an Android app to your Firebase project. Enter the application's **Package Name** (usually found in `app/build.gradle`).
3.  **Download the `google-services.json` file** and place it inside the `app/` directory of your Android Studio project.
4.  In the Firebase Console, enable the following services:
      * **Authentication** (e.g., Google or Email/Password).
      * **Cloud Firestore** (Create a new database, *start in test mode* for development).
      * **Realtime Database** (Create a new database, set up *rules* for testing).

### 3\. Build & Run

1.  Open the project in **Android Studio**.
2.  Sync your project with Gradle files (`File > Sync Project with Gradle Files`).
3.  Select your Android device or emulator.
4.  Click the **Run** button (green triangle icon) to install and launch the application.

## 💡 Database Structure

### Firestore (Structured Data)

| Collection | Purpose |
| :--- | :--- |
| `/users/{userId}` | Stores user profiles and main performance metrics. |
| `/posts/{postId}` | Stores user posts and post details. |
| `/wasteHistoryItems/{wasteId}` | Stores user waste histories and item details |
| `/wasteDatabaseItems/{wasteId}` | Waste items for Waste Database. |

### Realtime Database (Real-time Data)

| Node | Key Fields (Example) | Purpose |
| :--- | :--- | :--- |
| `/notifications/{userId}` | `type`, `postId`, `toUserId`, `fromUserId`, `createdAt` | Real-time notification delivery. |


## Acknowledgements

### Lottie Animations
This application uses free Lottie animations from [LottieFiles](https://lottiefiles.com) under the **LottieFiles Free License**:

- [Parsa Loading](https://lottiefiles.com/free-animation/parsa-loading-IzVLVFabNZ)
- [Becket Trash Can](https://lottiefiles.com/free-animation/becket-trash-can-ElKSXsGSS9)
- [Success](https://lottiefiles.com/free-animation/success-IINQ21ARfo)

These assets are **free for personal and commercial use** and do **not require attribution**, but we would like to thank the creators for making them available.  
[View License](https://lottiefiles.com/page/license)

---

### Images
This application also uses free images from [Pixabay](https://pixabay.com) under the **Pixabay Content License**:

- [Waste – Social Documentary Iranian](https://pixabay.com/photos/waste-social-documentary-iranian-7038412/)

These images are **free for personal and commercial use** and do **not require attribution**, but we would like to thank the contributors for making them available.  
[View License](https://pixabay.com/service/license-summary/)
