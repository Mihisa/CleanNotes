
Android example with Clean Architecture by layer.

    MVI architectural pattern
    Kotlin
    Coroutines
    Flows and channels
    Network layer (Firestore)
    Caching layer (Room Persistence) & planning a caching strategy
    Firestore testing (Firebase Emulators)
    Unit tests (Junit5)
    Instrumentation testing (Espresso and androidx.test)
    Gradle Scripting (automate test running)
    Test reports
    Dagger2
    Navigation Components

# Running this app

To run this app you will need to create a firebase project and hook it up with the project.
# Running the Tests
1. cd into /tests/
2. type in terminal: `run_tests.sh`
This will run all the unit tests and instrumentation tests. It will also start the firebase emulator to simulate firestore db.
**The test results** are in `/app/build/reports/`.
