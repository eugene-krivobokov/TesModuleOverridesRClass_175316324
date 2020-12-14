This is a sample app for https://issuetracker.google.com/issues/175316324

How to reproduce:

- Run test `ExampleTest` in app module. It must fail.
- Uncomment `android.nonTransitiveRClass=true` in gradle.properties
- Change packageName for `feature-test` module
- Run test, it will pass