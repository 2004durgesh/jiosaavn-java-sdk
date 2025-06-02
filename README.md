# JioSaavn API Client for Java

A Java client library for interacting with the JioSaavn music streaming service API.

## Description

This library provides a convenient way to access JioSaavn's data, such as information about songs, albums, artists, and playlists. It handles the underlying API requests and data parsing, allowing you to focus on integrating JioSaavn's features into your Java applications.

## Features

- **Comprehensive API Coverage**: Fetch details for songs, albums, artists, and playlists using dedicated services like [`ArtistService`](./src/main/java/com/jiosaavn/services/ArtistService.java), [`AlbumService`](./src/main/java/com/jiosaavn/services/AlbumService.java), [`SongService`](./src/main/java/com/jiosaavn/services/SongService.java), and [`PlaylistService`](./src/main/java/com/jiosaavn/services/PlaylistService.java).
- **Powerful Search**: Search for various content types on JioSaavn via the [`SearchService`](./src/main/java/com/jiosaavn/services/SearchService.java).
- **Structured Data Models**: Parses API responses into well-defined Java objects (POJOs) for easy access and manipulation. These models are primarily located in the `com.jiosaavn.models` package (e.g., [`Song.SongModel`](./src/main/java/com/jiosaavn/models/Song.java), [`Album.AlbumModel`](./src/main/java/com/jiosaavn/models/Album.java), [`Artist.ArtistModel`](./src/main/java/com/jiosaavn/models/artists/Artist.java)).
- **Utility Functions**: Includes helper methods in [`Utils`](./src/main/java/com/jiosaavn/utils/Utils.java) for common tasks, such as generating image links of various qualities ([`Utils.createImageLinks`](./src/main/java/com/jiosaavn/utils/Utils.java)) and creating download URLs ([`Utils.createDownloadUrl`](./src/main/java/com/jiosaavn/utils/Utils.java)).
- **Robust API Interaction**:
    - Utilizes OkHttp (dependency in [build.gradle.kts](./build.gradle.kts)) for efficient and reliable HTTP requests.
    - Employs Jackson (dependency in [build.gradle.kts](./build.gradle.kts)) for fast and flexible JSON parsing.
    - Automatically rotates User-Agents for API requests, managed by [`BaseService`](./src/main/java/com/jiosaavn/models/BaseService.java) using a list from [`UserAgents`](./src/main/java/com/jiosaavn/constants/UserAgents.java), to mimic diverse client environments.
- **Predefined API Endpoints**: Uses a structured set of API endpoints defined in [`Endpoints`](./src/main/java/com/jiosaavn/constants/Endpoints.java).

## Prerequisites

- Java Development Kit (JDK) 8 or higher.
- Gradle (for building the project).

## Building the Project

To build the project and generate the JAR file, you can use the Gradle wrapper:

```bash
./gradlew build
```

On Windows, use:

```bash
.\gradlew.bat build
```

The compiled JAR file will be located in the `build/libs` directory.

## Usage

The main entry point for using the client is the `com.jiosaavn.JioSaavnClient` class.

Here's a basic example of how to use the client (assuming you have a method to fetch artist details):

```java
import com.jiosaavn.JioSaavnClient;
import com.jiosaavn.models.Album;
import com.jiosaavn.utils.JsonUtils;

import java.io.IOException;

public class Test {
  public static void main(String[] args) {
    JioSaavnClient client = new JioSaavnClient();

    try {
      Album.AlbumModel album = client.albumService.getAlbumById("23241654");
      System.out.println(JsonUtils.toJson(album));
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}

```

### Available Services

- `ArtistService`: For fetching artist-related information.
- `AlbumService`: For fetching album-related information.
- `SongService`: For fetching song-related information.
- `PlaylistService`: For fetching playlist-related information.
- `SearchService`: For searching content on JioSaavn.
- (Add other services as they are implemented)

## Contributing

Contributions are welcome! If you'd like to contribute, please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/your-feature-name`).
3. Make your changes.
4. Commit your changes (`git commit -m 'Add some feature'`).
5. Push to the branch (`git push origin feature/your-feature-name`).
6. Open a Pull Request.

Please make sure to update tests as appropriate.

## License

This project is licensed under the terms of the [LICENSE](LICENSE) file.
