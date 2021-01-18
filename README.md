# SpokenTime library

This little tool serves as a converter of time to British spoken time expressions. E.g _10:30_ will become _half past ten_.

## Usage
This is a maven project, which serves both as a library and an executable.

### Standalone app
To use it as a standalone tool, run:
```
mvn package
```
Then you can run the app by executing e.g.:
```
cd target
java -jar spokentime-0.0.1-SNAPSHOT.jar 13:36
```
This should output: _one thirty six_

### Library
To use it as a library (e.g. with my spokentime-webapp) run:
```
mvn install
```
This will put the package to your local Maven repo, so the other projects can use it.