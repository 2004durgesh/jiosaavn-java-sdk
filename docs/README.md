# Adding to Your Project

## Using JitPack (Recommended)

### For Gradle Projects

**Step 1:** Add the JitPack repository to your build file

Add it in your root `settings.gradle` at the end of repositories:

```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```

**Step 2:** Add the dependency

```gradle
dependencies {
    implementation 'com.github.2004durgesh:jiosaavn-java-sdk:Tag'
}
```

### For Maven Projects

**Step 1:** Add the JitPack repository to your build file

Add to your `pom.xml`:

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

**Step 2:** Add the dependency

```xml
<dependency>
    <groupId>com.github.2004durgesh</groupId>
    <artifactId>jiosaavn-java-sdk</artifactId>
    <version>Tag</version>
</dependency>
```

> **Note:** Replace `latest-version` with the latest release version from [releases](https://github.com/2004durgesh/jiosaavn-java-sdk/releases) or visit [JitPack](https://jitpack.io/#2004durgesh/jiosaavn-java-sdk) for version details.


## Manually Building the Project

To build the project and generate the JAR file, you can use the Gradle wrapper:

```bash
./gradlew build
```

On Windows, use:

```bash
.\gradlew.bat build
```