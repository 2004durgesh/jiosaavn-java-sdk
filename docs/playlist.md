# Playlist

<h2>Methods</h2>

- [getPlaylistById](#getPlaylistById)


### getPlaylistById
> Note: This method is a subclass of the [`PlaylistService`](../src/main/java/com/jiosaavn/services/PlaylistService.java) class.


<h4>Parameters</h4>

| Parameter | Type     | Description         |
|-----------|----------|---------------------|
| id        | `String` | id of the playlist. |

```java
public static void main(String[] args) {
    JioSaavnClient client = new JioSaavnClient();

    try {
        Playlist.PlaylistModel playlist = client.playlistService.getPlaylistById("903166403");
        System.out.println(JsonUtils.toJson(playlist));
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
```

returns a [`Playlist.PlaylistModel`](../src/main/java/com/jiosaavn/models/playlist.java) \
output:

```json
{
  "id": "903166403",
  "name": "Best Of Romance - Hindi",
  "description": "The Best Of Romantic Music.                                                                                        \nArtists On Cover: Ranbir Kapoor &amp; Alia Bhatt",
  "year": null,
  "type": "playlist",
  "playCount": null,
  "language": "",
  "explicitContent": false,
  "artists": [
    {
      "id": "456323",
      "name": "Pritam",
      "role": "music",
      "type": "artist",
      "image": [
        {
          "quality": "50x50",
          "url": "https://c.saavncdn.com/artists/Pritam_Chakraborty-20170711073326_50x50.jpg"
        },
        {
          "quality": "150x150",
          "url": "https://c.saavncdn.com/artists/Pritam_Chakraborty-20170711073326_150x150.jpg"
        },
        {
          "quality": "500x500",
          "url": "https://c.saavncdn.com/artists/Pritam_Chakraborty-20170711073326_500x500.jpg"
        }
      ],
      "url": "https://www.jiosaavn.com/artist/pritam-songs/OaFg9HPZgq8_"
    },
    {
      "id": "459320",
      "name": "Arijit Singh",
      "role": "singer",
      "type": "artist",
      "image": [
        {
          "quality": "50x50",
          "url": "https://c.saavncdn.com/artists/Arijit_Singh_004_20241118063717_50x50.jpg"
        },
        {
          "quality": "150x150",
          "url": "https://c.saavncdn.com/artists/Arijit_Singh_004_20241118063717_150x150.jpg"
        },
        {
          "quality": "500x500",
          "url": "https://c.saavncdn.com/artists/Arijit_Singh_004_20241118063717_500x500.jpg"
        }
      ],
      "url": "https://www.jiosaavn.com/artist/arijit-singh-songs/LlRWpHzy3Hk_"
    },
    {
      "id": "458681",
      "name": "Amitabh Bhattacharya",
      "role": "singer",
      "type": "artist",
      "image": [
        {
          "quality": "50x50",
          "url": "https://c.saavncdn.com/artists/Amitabh_Bhattacharya_003_20241118063351_50x50.jpg"
        },
        {
          "quality": "150x150",
          "url": "https://c.saavncdn.com/artists/Amitabh_Bhattacharya_003_20241118063351_150x150.jpg"
        },
        {
          "quality": "500x500",
          "url": "https://c.saavncdn.com/artists/Amitabh_Bhattacharya_003_20241118063351_500x500.jpg"
        }
      ],
      "url": "https://www.jiosaavn.com/artist/amitabh-bhattacharya-songs/hsNRL6ZmJmo_"
    },
    {
      "id": "12841161",
      "name": "Pritam",
      "role": "singer",
      "type": "artist",
      "image": [],
      "url": "https://www.jiosaavn.com/artist/pritam-songs/ES25qtjiVmo_"
    },
    {
      "id": "",
      "name": "Arijit Singh &amp; Amitabh Bhattacharya",
      "role": "singer",
      "type": "artist",
      "image": [],
      "url": "https://www.jiosaavn.com/artist/arijit-singh-amitabh-bhattacharya-songs/"
    },
    {
      "id": "459632",
      "name": "Ranbir Kapoor",
      "role": "starring",
      "type": "artist",
      "image": [
        {
          "quality": "50x50",
          "url": "https://c.saavncdn.com/artists/Ranbir_Kapoor_50x50.jpg"
        },
        {
          "quality": "150x150",
          "url": "https://c.saavncdn.com/artists/Ranbir_Kapoor_150x150.jpg"
        },
        {
          "quality": "500x500",
          "url": "https://c.saavncdn.com/artists/Ranbir_Kapoor_500x500.jpg"
        }
      ],
      "url": "https://www.jiosaavn.com/artist/ranbir-kapoor-songs/nqAfNmNB5II_"
    },
    {
      "id": "511658",
      "name": "Alia Bhatt",
      "role": "starring",
      "type": "artist",
      "image": [
        {
          "quality": "50x50",
          "url": "https://c.saavncdn.com/artists/Alia_Bhatt_50x50.jpg"
        },
        {
          "quality": "150x150",
          "url": "https://c.saavncdn.com/artists/Alia_Bhatt_150x150.jpg"
        },
        {
          "quality": "500x500",
          "url": "https://c.saavncdn.com/artists/Alia_Bhatt_500x500.jpg"
        }
      ],
      "url": "https://www.jiosaavn.com/artist/alia-bhatt-songs/,henzzVDXDQ_"
    },
    {
      "id": "456117",
      "name": "Amitabh Bachchan",
      "role": "starring",
      "type": "artist",
      "image": [
        {
          "quality": "50x50",
          "url": "https://c.saavncdn.com/artists/Amitabh_Bachchan_50x50.jpg"
        },
        {
          "quality": "150x150",
          "url": "https://c.saavncdn.com/artists/Amitabh_Bachchan_150x150.jpg"
        },
        {
          "quality": "500x500",
          "url": "https://c.saavncdn.com/artists/Amitabh_Bachchan_500x500.jpg"
        }
      ],
      "url": "https://www.jiosaavn.com/artist/amitabh-bachchan-songs/X6Dce0iJ7y0_"
    },
    {
      "id": "1595701",
      "name": "Tanishk Bagchi",
      "role": "music",
      "type": "artist",
      "image": [
        {
          "quality": "50x50",
          "url": "https://c.saavncdn.com/artists/Tanishk_Bagchi_002_20190607071953_50x50.jpg"
        },
        {
          "quality": "150x150",
          "url": "https://c.saavncdn.com/artists/Tanishk_Bagchi_002_20190607071953_150x150.jpg"
        },
        {
          "quality": "500x500",
          "url": "https://c.saavncdn.com/artists/Tanishk_Bagchi_002_20190607071953_500x500.jpg"
        }
      ],
      "url": "https://www.jiosaavn.com/artist/tanishk-bagchi-songs/Y-5m-phldpg_"
    },
    {
      "id": "881158",
      "name": "Jubin Nautiyal",
      "role": "singer",
      "type": "artist",
      "image": [
        {
          "quality": "50x50",
          "url": "https://c.saavncdn.com/artists/Jubin_Nautiyal_003_20231130204020_50x50.jpg"
        },
        {
          "quality": "150x150",
          "url": "https://c.saavncdn.com/artists/Jubin_Nautiyal_003_20231130204020_150x150.jpg"
        },
        {
          "quality": "500x500",
          "url": "https://c.saavncdn.com/artists/Jubin_Nautiyal_003_20231130204020_500x500.jpg"
        }
      ],
      "url": "https://www.jiosaavn.com/artist/jubin-nautiyal-songs/uGdfg6zGf4s_"
    },
    {
      "id": "706985",
      "name": "Asees Kaur",
      "role": "singer",
      "type": "artist",
      "image": [
        {
          "quality": "50x50",
          "url": "https://c.saavncdn.com/artists/Asees_Kaur_007_20250303070610_50x50.jpg"
        },
        {
          "quality": "150x150",
          "url": "https://c.saavncdn.com/artists/Asees_Kaur_007_20250303070610_150x150.jpg"
        },
        {
          "quality": "500x500",
          "url": "https://c.saavncdn.com/artists/Asees_Kaur_007_20250303070610_500x500.jpg"
        }
      ],
      "url": "https://www.jiosaavn.com/artist/asees-kaur-songs/3LZ-9DxxiH8_"
    }
  ],
  "songCount": 45,
  "url": "https://www.jiosaavn.com/featured/best-of-romance-hindi/SBKnUgjNeMIwkg5tVhI3fw__",
  "image": [
    {
      "quality": "50x50",
      "url": "https://c.saavncdn.com/editorial/BestOfRomanceHindi_20250530053127.jpg?bch=1748584898"
    },
    {
      "quality": "150x150",
      "url": "https://c.saavncdn.com/editorial/BestOfRomanceHindi_20250530053127.jpg?bch=1748584898"
    },
    {
      "quality": "500x500",
      "url": "https://c.saavncdn.com/editorial/BestOfRomanceHindi_20250530053127.jpg?bch=1748584898"
    }
  ],
  "songs": [
    {
      "id": "EbFWakDs",
      "name": "Kesariya (From &quot;Brahmastra&quot;)",
      "type": "song",
      "year": "2022",
      "releaseDate": "2022",
      "duration": 268,
      "label": "Sony Music Entertainment India Pvt. Ltd.",
      "explicitContent": false,
      "playCount": 199887457,
      "language": "hindi",
      "hasLyrics": false,
      "lyricsId": "EbFWakDs",
      "url": "https://www.jiosaavn.com/song/kesariya-from-brahmastra/NQotZhVbc0A",
      "copyright": "(P) 2022 Sony Music Entertainment India Pvt. Ltd.",
      "album": {
        "id": "36552397",
        "name": "Kesariya (From &quot;Brahmastra&quot;)",
        "url": "https://www.jiosaavn.com/album/kesariya-from-brahmastra/3RMVXHzqov8_"
      },
      "artists": {
        "primary_artists": [
          {
            "id": "456323",
            "name": "Pritam",
            "role": "primary_artists",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Pritam_Chakraborty-20170711073326_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Pritam_Chakraborty-20170711073326_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Pritam_Chakraborty-20170711073326_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/pritam-songs/OaFg9HPZgq8_"
          },
          {
            "id": "459320",
            "name": "Arijit Singh",
            "role": "primary_artists",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Arijit_Singh_004_20241118063717_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Arijit_Singh_004_20241118063717_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Arijit_Singh_004_20241118063717_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/arijit-singh-songs/LlRWpHzy3Hk_"
          },
          {
            "id": "458681",
            "name": "Amitabh Bhattacharya",
            "role": "primary_artists",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Amitabh_Bhattacharya_003_20241118063351_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Amitabh_Bhattacharya_003_20241118063351_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Amitabh_Bhattacharya_003_20241118063351_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/amitabh-bhattacharya-songs/hsNRL6ZmJmo_"
          }
        ],
        "featured_artists": [],
        "artists": [
          {
            "id": "456323",
            "name": "Pritam",
            "role": "music",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Pritam_Chakraborty-20170711073326_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Pritam_Chakraborty-20170711073326_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Pritam_Chakraborty-20170711073326_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/pritam-songs/OaFg9HPZgq8_"
          },
          {
            "id": "456323",
            "name": "Pritam",
            "role": "singer",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Pritam_Chakraborty-20170711073326_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Pritam_Chakraborty-20170711073326_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Pritam_Chakraborty-20170711073326_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/pritam-songs/OaFg9HPZgq8_"
          },
          {
            "id": "459320",
            "name": "Arijit Singh",
            "role": "singer",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Arijit_Singh_004_20241118063717_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Arijit_Singh_004_20241118063717_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Arijit_Singh_004_20241118063717_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/arijit-singh-songs/LlRWpHzy3Hk_"
          },
          {
            "id": "458681",
            "name": "Amitabh Bhattacharya",
            "role": "singer",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Amitabh_Bhattacharya_003_20241118063351_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Amitabh_Bhattacharya_003_20241118063351_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Amitabh_Bhattacharya_003_20241118063351_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/amitabh-bhattacharya-songs/hsNRL6ZmJmo_"
          },
          {
            "id": "12841161",
            "name": "Pritam",
            "role": "singer",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/pritam-songs/ES25qtjiVmo_"
          },
          {
            "id": "",
            "name": "Arijit Singh &amp; Amitabh Bhattacharya",
            "role": "singer",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/arijit-singh-amitabh-bhattacharya-songs/"
          },
          {
            "id": "458681",
            "name": "Amitabh Bhattacharya",
            "role": "lyricist",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Amitabh_Bhattacharya_003_20241118063351_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Amitabh_Bhattacharya_003_20241118063351_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Amitabh_Bhattacharya_003_20241118063351_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/amitabh-bhattacharya-songs/hsNRL6ZmJmo_"
          },
          {
            "id": "459632",
            "name": "Ranbir Kapoor",
            "role": "starring",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Ranbir_Kapoor_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Ranbir_Kapoor_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Ranbir_Kapoor_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/ranbir-kapoor-songs/nqAfNmNB5II_"
          },
          {
            "id": "511658",
            "name": "Alia Bhatt",
            "role": "starring",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Alia_Bhatt_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Alia_Bhatt_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Alia_Bhatt_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/alia-bhatt-songs/,henzzVDXDQ_"
          },
          {
            "id": "456117",
            "name": "Amitabh Bachchan",
            "role": "starring",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Amitabh_Bachchan_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Amitabh_Bachchan_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Amitabh_Bachchan_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/amitabh-bachchan-songs/X6Dce0iJ7y0_"
          }
        ]
      },
      "image": [
        {
          "quality": "50x50",
          "url": "https://c.saavncdn.com/191/Kesariya-From-Brahmastra-Hindi-2022-20220717092820-50x50.jpg"
        },
        {
          "quality": "150x150",
          "url": "https://c.saavncdn.com/191/Kesariya-From-Brahmastra-Hindi-2022-20220717092820-150x150.jpg"
        },
        {
          "quality": "500x500",
          "url": "https://c.saavncdn.com/191/Kesariya-From-Brahmastra-Hindi-2022-20220717092820-500x500.jpg"
        }
      ],
      "downloadUrl": [
        {
          "quality": "12kbps",
          "url": "http://aac.saavncdn.com/191/0c353932c6bb495fe0e6e885c42a7367_12.mp4"
        },
        {
          "quality": "48kbps",
          "url": "http://aac.saavncdn.com/191/0c353932c6bb495fe0e6e885c42a7367_48.mp4"
        },
        {
          "quality": "96kbps",
          "url": "http://aac.saavncdn.com/191/0c353932c6bb495fe0e6e885c42a7367_96.mp4"
        },
        {
          "quality": "160kbps",
          "url": "http://aac.saavncdn.com/191/0c353932c6bb495fe0e6e885c42a7367_160.mp4"
        },
        {
          "quality": "320kbps",
          "url": "http://aac.saavncdn.com/191/0c353932c6bb495fe0e6e885c42a7367_320.mp4"
        }
      ]
    },
    {
      "id": "mPTrDSun",
      "name": "Raataan Lambiyan",
      "type": "song",
      "year": "2021",
      "releaseDate": "2021",
      "duration": 230,
      "label": "Sony Music Entertainment India Pvt. Ltd.",
      "explicitContent": false,
      "playCount": 461452428,
      "language": "hindi",
      "hasLyrics": false,
      "lyricsId": "mPTrDSun",
      "url": "https://www.jiosaavn.com/song/raataan-lambiyan/HTg-QzBjQl0",
      "copyright": "(P) 2021 Sony Music Entertainment India Pvt. Ltd.",
      "album": {
        "id": "29060166",
        "name": "Shershaah",
        "url": "https://www.jiosaavn.com/album/shershaah/R6ANCBJdPQM_"
      },
      "artists": {
        "primary_artists": [
          {
            "id": "1595701",
            "name": "Tanishk Bagchi",
            "role": "primary_artists",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Tanishk_Bagchi_002_20190607071953_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Tanishk_Bagchi_002_20190607071953_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Tanishk_Bagchi_002_20190607071953_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/tanishk-bagchi-songs/Y-5m-phldpg_"
          },
          {
            "id": "881158",
            "name": "Jubin Nautiyal",
            "role": "primary_artists",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Jubin_Nautiyal_003_20231130204020_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Jubin_Nautiyal_003_20231130204020_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Jubin_Nautiyal_003_20231130204020_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/jubin-nautiyal-songs/uGdfg6zGf4s_"
          },
          {
            "id": "706985",
            "name": "Asees Kaur",
            "role": "primary_artists",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Asees_Kaur_007_20250303070610_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Asees_Kaur_007_20250303070610_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Asees_Kaur_007_20250303070610_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/asees-kaur-songs/3LZ-9DxxiH8_"
          }
        ],
        "featured_artists": [],
        "artists": [
          {
            "id": "1595701",
            "name": "Tanishk Bagchi",
            "role": "music",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Tanishk_Bagchi_002_20190607071953_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Tanishk_Bagchi_002_20190607071953_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Tanishk_Bagchi_002_20190607071953_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/tanishk-bagchi-songs/Y-5m-phldpg_"
          },
          {
            "id": "1595701",
            "name": "Tanishk Bagchi",
            "role": "singer",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Tanishk_Bagchi_002_20190607071953_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Tanishk_Bagchi_002_20190607071953_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Tanishk_Bagchi_002_20190607071953_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/tanishk-bagchi-songs/Y-5m-phldpg_"
          },
          {
            "id": "881158",
            "name": "Jubin Nautiyal",
            "role": "singer",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Jubin_Nautiyal_003_20231130204020_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Jubin_Nautiyal_003_20231130204020_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Jubin_Nautiyal_003_20231130204020_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/jubin-nautiyal-songs/uGdfg6zGf4s_"
          },
          {
            "id": "706985",
            "name": "Asees Kaur",
            "role": "singer",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Asees_Kaur_007_20250303070610_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Asees_Kaur_007_20250303070610_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Asees_Kaur_007_20250303070610_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/asees-kaur-songs/3LZ-9DxxiH8_"
          },
          {
            "id": "682930",
            "name": "Sidharth Malhotra",
            "role": "starring",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Sidharth_Malhotra_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Sidharth_Malhotra_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Sidharth_Malhotra_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/sidharth-malhotra-songs/na,EAoXKSjk_"
          },
          {
            "id": "702466",
            "name": "Kiara Advani",
            "role": "starring",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Kiara_Advani_002_20230726172900_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Kiara_Advani_002_20230726172900_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Kiara_Advani_002_20230726172900_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/kiara-advani-songs/pxV2A60cbkI_"
          },
          {
            "id": "11391768",
            "name": "Manmeet Kaur",
            "role": "starring",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Manmeet_Kaur_000_20210906210954_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Manmeet_Kaur_000_20210906210954_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Manmeet_Kaur_000_20210906210954_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/manmeet-kaur-songs/B1O2eWGcrcY_"
          }
        ]
      },
      "image": [
        {
          "quality": "50x50",
          "url": "https://c.saavncdn.com/238/Shershaah-Original-Motion-Picture-Soundtrack--Hindi-2021-20210815181610-50x50.jpg"
        },
        {
          "quality": "150x150",
          "url": "https://c.saavncdn.com/238/Shershaah-Original-Motion-Picture-Soundtrack--Hindi-2021-20210815181610-150x150.jpg"
        },
        {
          "quality": "500x500",
          "url": "https://c.saavncdn.com/238/Shershaah-Original-Motion-Picture-Soundtrack--Hindi-2021-20210815181610-500x500.jpg"
        }
      ],
      "downloadUrl": [
        {
          "quality": "12kbps",
          "url": "http://aac.saavncdn.com/238/35726d4394604604e961bf5b846870d0_12.mp4"
        },
        {
          "quality": "48kbps",
          "url": "http://aac.saavncdn.com/238/35726d4394604604e961bf5b846870d0_48.mp4"
        },
        {
          "quality": "96kbps",
          "url": "http://aac.saavncdn.com/238/35726d4394604604e961bf5b846870d0_96.mp4"
        },
        {
          "quality": "160kbps",
          "url": "http://aac.saavncdn.com/238/35726d4394604604e961bf5b846870d0_160.mp4"
        },
        {
          "quality": "320kbps",
          "url": "http://aac.saavncdn.com/238/35726d4394604604e961bf5b846870d0_320.mp4"
        }
      ]
    },
    {...},
  ]
}
```
