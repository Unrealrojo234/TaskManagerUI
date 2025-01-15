# Task Manager App

A simple Android application that displays a task completion screen using Jetpack Compose. The app shows a congratulatory message with an icon when a task is completed.

## Features

- Clean, centered layout design
- Task completion icon
- Congratulatory message with styled text
- Material 3 design integration
- Edge-to-edge display support

## Components

### Main Screen
- Centered completion icon
- Bold "Task Completed" text
- Italicized congratulatory message
- Responsive layout that adapts to different screen sizes

### UI Elements
- Custom text styling with different font weights and styles
- Proper spacing between elements
- Centered Column layout within a Box
- Material Design Scaffold implementation

## Implementation

Key features of the implementation include:
- Use of Jetpack Compose for modern UI development
- Material 3 theming
- Edge-to-edge display support
- Preview support for development

## Setup

1. Clone the repository
2. Open in Android Studio
3. Sync project with Gradle files
4. Run on an emulator or physical device

## Requirements

- Android Studio Hedgehog or newer
- Minimum SDK: [Your minimum SDK version]
- Kotlin 1.9+
- Jetpack Compose

## Customization

To customize the app:
1. Replace the task completion icon in `res/drawable/`
2. Modify the completion message in `MainActivity`
3. Adjust the text styling in `TaskComplete` composable

## Preview

The app includes a preview function for development. To use it:
1. Open the `TaskCompletePreview` function in Android Studio
2. Switch to Design view
3. Preview shows the layout with sample text and icon
