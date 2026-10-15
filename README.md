# AimZoom (prototype source project)

A minimal client-side Minecraft Java/Fabric zoom-mod starter intended for Minecraft 26.2. Hold **C** to zoom in. This is prototype source, not a verified release build.

## Easiest build using only an Android phone

This project includes a GitHub Actions workflow so you can compile it in the cloud without installing Java/Gradle on your phone.

1. Sign in to GitHub in your browser and create a **new public or private repository** named `AimZoom`.
2. Extract this ZIP on your phone (Files app / ZArchiver), then upload the **contents of the AimZoom folder** to the repository root. Make sure `.github/workflows/build.yml` is included. If your file manager hides `.github`, enable hidden files or create the workflow manually in GitHub at `.github/workflows/build.yml`.
3. Open the repository's **Actions** tab and select **Build AimZoom**. If prompted, enable workflows, then press **Run workflow**.
4. Wait for the run to finish. A green check means the build completed. Open that run and download the **AimZoom-JAR** artifact. GitHub may download it as a ZIP; extract the `.jar` from it.
5. Copy the JAR to the Minecraft instance's `mods` folder and launch the matching Minecraft 26.2 Fabric profile. Back up the instance first.

## Build requirements / target
- Intended target: Minecraft 26.2
- Java 25
- Gradle 9.5.1
- Fabric Loader and Fabric API versions set in `gradle.properties`

## Important limitations
- This project has not been compiled or tested in-game here. The cloud build is the first validation step.
- The zoom multiplier is fixed at 0.20 (5x FOV reduction); the key is hard-coded to C rather than configurable in Controls.
- If Minecraft 26.2 changed the renderer method signature or the Fabric versions are unavailable, the build will fail and the source will need updating. Share the GitHub Actions error log to diagnose it.
- This is a client-side mod; it does not need to be installed on a server.
