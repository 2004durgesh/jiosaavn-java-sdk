# JioSaavn API Client for Java

A Java client library for interacting with the JioSaavn music streaming service API.

## Table of Contents

- [Description](#description)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Building the Project](#building-the-project)
- [Usage](#usage)
- [API Examples](#api-examples)
- [Documentation](#documentation)
- [Error Handling](#error-handling)
- [Contributing](#contributing)
- [Changelog](#changelog)
- [License](#license)

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


The compiled JAR file will be located in the `build/libs` directory.

## Usage

The main entry point for using the client is the `com.jiosaavn.JioSaavnClient` class.

Here's a basic example demonstrating how to fetch album details:

```java
import com.jiosaavn.JioSaavnClient;
import com.jiosaavn.models.Album;
import com.jiosaavn.utils.JsonUtils;

import java.io.IOException;

public class Example {
    public static void main(String[] args) {
        JioSaavnClient client = new JioSaavnClient();

        try {
            Album.AlbumModel album = client.albumService.getAlbumById("23241654");
            System.out.println("Album: " + album.name);
            System.out.println("Year: " + album.year);
            System.out.println("Total Songs: " + album.songCount);

            // For complete JSON output
            System.out.println(JsonUtils.toJson(album));
        } catch (IOException e) {
            System.err.println("Error fetching album: " + e.getMessage());
        }
    }
}
```
## Documentation

For detailed documentation on how to use the JioSaavn API client, refer to the [Docs](./docs/README.md) directory. It contains information on how to set up the client, use various services, and examples of fetching data.

### Available Services

- `ArtistService`: For fetching artist-related information.
- `AlbumService`: For fetching album-related information.
- `SongService`: For fetching song-related information.
- `PlaylistService`: For fetching playlist-related information.
- `SearchService`: For searching content on JioSaavn.

## Error Handling

The library throws `IOException` for API communication errors. It's recommended to handle these exceptions appropriately:

```java
try {
    Album.AlbumModel album = client.albumService.getAlbumById("invalid-id");
} catch (IOException e) {
    // Handle API errors (network issues, invalid IDs, etc.)
    System.err.println("API Error: " + e.getMessage());
} catch (Exception e) {
    // Handle other unexpected errors
    System.err.println("Unexpected error: " + e.getMessage());
}
```

## Performance Tips

- **Reuse Client Instance**: Create one `JioSaavnClient` instance and reuse it across your application
- **Handle Rate Limits**: Be mindful of API rate limits when making multiple requests
- **Error Handling**: Always implement proper error handling for network failures

## Changelog

For a complete list of changes, see the [Releases](https://github.com/2004durgesh/jiosaavn-java-sdk/releases) page.

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
