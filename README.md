# Deleted App Project

This project provides a lightweight placeholder Android application designed to replace obsolete or problematic apps on the Google Play Store before they are permanently deleted.

## Purpose

The Google Play Store often prevents developers from deleting an app if it has outstanding issues or policy violations that need addressing. If you have lost the original source code or cannot easily fix the existing app, this project serves as a "clean slate" replacement. 

By publishing this minimalist app over your existing one, you can resolve technical/policy blockers and magically enable the option to permanently delete the app from the store.

## How to Use

1.  **Change Application ID**: Update the `applicationId` in `app/build.gradle.kts` to match your existing app's package name.
2.  **App Name**: Customize the `appName` variable in `app/build.gradle.kts`.
3.  **Sign the App**:
    *   Use your original signing certificate (keystore).
    *   Alternatively, use the "Google Play App Signing" if you have it enabled.
4.  **Publish**: Upload the generated Bundle (AAR) or APK to the Google Play Console as a new release on the Production track.

## Permanently Deleting an App from Google Play

Once your placeholder app is published and the status is "Active", the deletion process becomes available:

1.  **Unpublish**: Go to **Advanced settings** > **App availability** and select **Unpublish**.
2.  **Eligibility for Deletion**: An app can usually be deleted if:
    *   It is unpublished.
    *   It has fewer than 100 active installs (devices turned on in the last 30 days).
    *   It's in good standing (not suspended).
3.  **Self-Service**: If eligible, a **Delete app** button will appear in **Advanced settings**.
4.  **Request Deletion**: If the button doesn't appear (e.g., for apps with high lifetime installs), you must contact Google Play Support via their official contact form to request permanent removal.

## Technologies

- **Language**: Kotlin 2.0.21
- **Build System**: Gradle 8.9 (via Wrapper)
- **UI**: Android XML Layout (ConstraintLayout)
- **Minimum SDK**: 24 (Android 7.0)
- **Target SDK**: 35 (Android 15)

## Disclaimer

This project is for **educational and research purposes only**. Use it responsibly to manage your own applications on the Google Play Store. The author is not responsible for any misuse or consequences resulting from the use of this software.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
