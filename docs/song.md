# SONGS

<h2>Methods</h2>

- [getSongById](#getSongById)
- [getSongByLink](#getSongByLink)
- [getLyricsById](#getLyricsById)

### getSongById
> Note: This method is a subclass of the [`SongService`](../src/main/java/com/jiosaavn/services/SongService.java) class.


<h4>Parameters</h4>

| Parameter | Type     | Description     |
|-----------|----------|-----------------|
| id        | `String` | id of the song. |

```java
public static void main(String[] args) {
    JioSaavnClient client = new JioSaavnClient();

    try {
        List<Song.SongModel> song = client.songService.getSongById("3IoDK8qI");
        System.out.println(JsonUtils.toJson(song));
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
```

returns a list of [`Song.SongModel`](../src/main/java/com/jiosaavn/models/Song.java) \
output:

```json
[
  {
    "id": "3IoDK8qI",
    "name": "Levitating",
    "type": "song",
    "year": "2020",
    "releaseDate": "2020",
    "duration": 203,
    "label": "Warner Records",
    "explicitContent": false,
    "playCount": 15440289,
    "language": "english",
    "hasLyrics": false,
    "lyricsId": "3IoDK8qI",
    "url": "https://www.jiosaavn.com/song/levitating/QyEEdT8IRno",
    "copyright": "℗ 2020  Dua Lipa Limited under exclusive license to Warner Records UK, a division of Warner Music UK Limited",
    "album": {
      "id": "23241654",
      "name": "Future Nostalgia",
      "url": "https://www.jiosaavn.com/album/future-nostalgia/ITIyo-GDr7A_"
    },
    "artists": {
      "primary_artists": [
        {
          "id": "1274170",
          "name": "Dua Lipa",
          "role": "primary_artists",
          "type": "artist",
          "image": [
            {
              "quality": "50x50",
              "url": "https://c.saavncdn.com/artists/Dua_Lipa_004_20231120090922_50x50.jpg"
            },
            {
              "quality": "150x150",
              "url": "https://c.saavncdn.com/artists/Dua_Lipa_004_20231120090922_150x150.jpg"
            },
            {
              "quality": "500x500",
              "url": "https://c.saavncdn.com/artists/Dua_Lipa_004_20231120090922_500x500.jpg"
            }
          ],
          "url": "https://www.jiosaavn.com/artist/dua-lipa-songs/r-OWIKgpX2I_"
        }
      ],
      "featured_artists": [],
      "artists": [
        {
          "id": "573802",
          "name": "Clarence Coffee Jr",
          "role": "music",
          "type": "artist",
          "image": [],
          "url": "https://www.jiosaavn.com/artist/clarence-coffee-jr-songs/2mX96rBxCYU_"
        },
        {
          "id": "1274170",
          "name": "Dua Lipa",
          "role": "music",
          "type": "artist",
          "image": [
            {
              "quality": "50x50",
              "url": "https://c.saavncdn.com/artists/Dua_Lipa_004_20231120090922_50x50.jpg"
            },
            {
              "quality": "150x150",
              "url": "https://c.saavncdn.com/artists/Dua_Lipa_004_20231120090922_150x150.jpg"
            },
            {
              "quality": "500x500",
              "url": "https://c.saavncdn.com/artists/Dua_Lipa_004_20231120090922_500x500.jpg"
            }
          ],
          "url": "https://www.jiosaavn.com/artist/dua-lipa-songs/r-OWIKgpX2I_"
        },
        {
          "id": "702498",
          "name": "Sarah Hudson",
          "role": "music",
          "type": "artist",
          "image": [
            {
              "quality": "50x50",
              "url": "https://c.saavncdn.com/587/Gypsy-Girl-A-Cappella--English-2017-20191123100913-50x50.jpg"
            },
            {
              "quality": "150x150",
              "url": "https://c.saavncdn.com/587/Gypsy-Girl-A-Cappella--English-2017-20191123100913-150x150.jpg"
            },
            {
              "quality": "500x500",
              "url": "https://c.saavncdn.com/587/Gypsy-Girl-A-Cappella--English-2017-20191123100913-500x500.jpg"
            }
          ],
          "url": "https://www.jiosaavn.com/artist/sarah-hudson-songs/pW4Y,NKAPPI_"
        },
        {
          "id": "599533",
          "name": "Stephen Kozmeniuk",
          "role": "music",
          "type": "artist",
          "image": [],
          "url": "https://www.jiosaavn.com/artist/stephen-kozmeniuk-songs/lS1-2YuC5oc_"
        },
        {
          "id": "1274170",
          "name": "Dua Lipa",
          "role": "singer",
          "type": "artist",
          "image": [
            {
              "quality": "50x50",
              "url": "https://c.saavncdn.com/artists/Dua_Lipa_004_20231120090922_50x50.jpg"
            },
            {
              "quality": "150x150",
              "url": "https://c.saavncdn.com/artists/Dua_Lipa_004_20231120090922_150x150.jpg"
            },
            {
              "quality": "500x500",
              "url": "https://c.saavncdn.com/artists/Dua_Lipa_004_20231120090922_500x500.jpg"
            }
          ],
          "url": "https://www.jiosaavn.com/artist/dua-lipa-songs/r-OWIKgpX2I_"
        }
      ]
    },
    "image": [
      {
        "quality": "50x50",
        "url": "https://c.saavncdn.com/665/Future-Nostalgia-English-2020-20231110075246-50x50.jpg"
      },
      {
        "quality": "150x150",
        "url": "https://c.saavncdn.com/665/Future-Nostalgia-English-2020-20231110075246-150x150.jpg"
      },
      {
        "quality": "500x500",
        "url": "https://c.saavncdn.com/665/Future-Nostalgia-English-2020-20231110075246-500x500.jpg"
      }
    ],
    "downloadUrl": [
      {
        "quality": "12kbps",
        "url": "https://aac.saavncdn.com/665/7790c3b9097592113008eaf1031d6e57_12.mp4"
      },
      {
        "quality": "48kbps",
        "url": "https://aac.saavncdn.com/665/7790c3b9097592113008eaf1031d6e57_48.mp4"
      },
      {
        "quality": "96kbps",
        "url": "https://aac.saavncdn.com/665/7790c3b9097592113008eaf1031d6e57_96.mp4"
      },
      {
        "quality": "160kbps",
        "url": "https://aac.saavncdn.com/665/7790c3b9097592113008eaf1031d6e57_160.mp4"
      },
      {
        "quality": "320kbps",
        "url": "https://aac.saavncdn.com/665/7790c3b9097592113008eaf1031d6e57_320.mp4"
      }
    ]
  }
]
```


### getSongByLink
> Note: This method is a subclass of the [`SongService`](../src/main/java/com/jiosaavn/services/SongService.java) class.


<h4>Parameters</h4>

| Parameter | Type     | Description       |
|-----------|----------|-------------------|
| link      | `String` | link of the song. |

```java
public static void main(String[] args) {
    JioSaavnClient client = new JioSaavnClient();

    try {
        List<Song.SongModel> song = client.songService.getSongByLink("https://www.jiosaavn.com/song/o-maahi/BwsYdR1jRHI");
        System.out.println(JsonUtils.toJson(song));
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
```

returns a list of [`Song.SongModel`](../src/main/java/com/jiosaavn/models/Song.java) \
output:

```json
[
  {
    "id": "wcsDiSsA",
    "name": "O Maahi",
    "type": "song",
    "year": "2023",
    "releaseDate": "2023",
    "duration": 233,
    "label": "T-Series",
    "explicitContent": false,
    "playCount": 88942680,
    "language": "hindi",
    "hasLyrics": true,
    "lyricsId": "wcsDiSsA",
    "url": "https://www.jiosaavn.com/song/o-maahi/BwsYdR1jRHI",
    "copyright": "℗ 2023 Super Cassettes Industries Private Limited",
    "album": {
      "id": "50592774",
      "name": "Dunki",
      "url": "https://www.jiosaavn.com/album/dunki/nOH0--eoFKo_"
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
          "id": "456259",
          "name": "Irshad Kamil",
          "role": "primary_artists",
          "type": "artist",
          "image": [
            {
              "quality": "50x50",
              "url": "https://c.saavncdn.com/artists/Irshad_Kamil_50x50.jpg"
            },
            {
              "quality": "150x150",
              "url": "https://c.saavncdn.com/artists/Irshad_Kamil_150x150.jpg"
            },
            {
              "quality": "500x500",
              "url": "https://c.saavncdn.com/artists/Irshad_Kamil_500x500.jpg"
            }
          ],
          "url": "https://www.jiosaavn.com/artist/irshad-kamil-songs/vgKnepfCTXw_"
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
          "id": "456259",
          "name": "Irshad Kamil",
          "role": "singer",
          "type": "artist",
          "image": [
            {
              "quality": "50x50",
              "url": "https://c.saavncdn.com/artists/Irshad_Kamil_50x50.jpg"
            },
            {
              "quality": "150x150",
              "url": "https://c.saavncdn.com/artists/Irshad_Kamil_150x150.jpg"
            },
            {
              "quality": "500x500",
              "url": "https://c.saavncdn.com/artists/Irshad_Kamil_500x500.jpg"
            }
          ],
          "url": "https://www.jiosaavn.com/artist/irshad-kamil-songs/vgKnepfCTXw_"
        },
        {
          "id": "456259",
          "name": "Irshad Kamil",
          "role": "lyricist",
          "type": "artist",
          "image": [
            {
              "quality": "50x50",
              "url": "https://c.saavncdn.com/artists/Irshad_Kamil_50x50.jpg"
            },
            {
              "quality": "150x150",
              "url": "https://c.saavncdn.com/artists/Irshad_Kamil_150x150.jpg"
            },
            {
              "quality": "500x500",
              "url": "https://c.saavncdn.com/artists/Irshad_Kamil_500x500.jpg"
            }
          ],
          "url": "https://www.jiosaavn.com/artist/irshad-kamil-songs/vgKnepfCTXw_"
        }
      ]
    },
    "image": [
      {
        "quality": "50x50",
        "url": "https://c.saavncdn.com/139/Dunki-Hindi-2023-20231220211003-50x50.jpg"
      },
      {
        "quality": "150x150",
        "url": "https://c.saavncdn.com/139/Dunki-Hindi-2023-20231220211003-150x150.jpg"
      },
      {
        "quality": "500x500",
        "url": "https://c.saavncdn.com/139/Dunki-Hindi-2023-20231220211003-500x500.jpg"
      }
    ],
    "downloadUrl": [
      {
        "quality": "12kbps",
        "url": "http://aac.saavncdn.com/139/61036495c7ba45adf72a856b60f054fd_12.mp4"
      },
      {
        "quality": "48kbps",
        "url": "http://aac.saavncdn.com/139/61036495c7ba45adf72a856b60f054fd_48.mp4"
      },
      {
        "quality": "96kbps",
        "url": "http://aac.saavncdn.com/139/61036495c7ba45adf72a856b60f054fd_96.mp4"
      },
      {
        "quality": "160kbps",
        "url": "http://aac.saavncdn.com/139/61036495c7ba45adf72a856b60f054fd_160.mp4"
      },
      {
        "quality": "320kbps",
        "url": "http://aac.saavncdn.com/139/61036495c7ba45adf72a856b60f054fd_320.mp4"
      }
    ]
  }
]
```

### getLyricsById
> Note: This method is a subclass of the [`SongService`](../src/main/java/com/jiosaavn/services/SongService.java) class.


<h4>Parameters</h4>

| Parameter | Type     | Description       |
|-----------|----------|-------------------|
| id        | `String` | id of the lyrics. |

```java
public static void main(String[] args) {
    JioSaavnClient client = new JioSaavnClient();

    try {
        Song.SongLyrics song = client.songService.getLyricsById("wcsDiSsA");
        System.out.println(JsonUtils.toJson(song));
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
```

returns  [`Song.SongLyrics`]((../src/main/java/com/jiosaavn/models/Song.java)) \
output:

```json
{
  "lyrics" : "Yaara teri kahaani mein ho zikr mera<br>Kahi teri khaamoshi mein ho fikr mera<br>Rukh tera jidhar ka ho, ho udhar mera<br>Teri baahon talak hi hain, yeh safar mera<br><br>O Maahi O Maahi O Maahi O Maahi<br>O Maahi O Maahi O Maahi O Maahi<br>Meri wafa pe haq hua tera...oh mahi ve<br>O Maahi O Maahi O Maahi O Maahi<br>O Maahi O Maahi O Maahi O Maahi<br>Lo main qayamat tak hua tera....<br><br>Baaton ko behne do, baahon mein rehne do<br>Hai sukoon inmein...<br>Raste woh begaane, jhoote woh afsaane<br>Tu na ho jinmein....<br>Ho thodi umar hain pyaar zyaada mera<br>Kaise bataaye saara tera hoga ?<br>Maine mujhe hain tujhko saunpna...<br><br>Aaahon pe baahon pe raahon panaho pe<br>Aaahon pe baahon pe saaho salaahon pe<br>Mere ishq pe haq hua tera....<br><br>O Maahi O Maahi O Maahi O Maahi<br>O Maahi O Maahi O Maahi O Maahi<br>Lo main qayamat tak hua tera....<br>O Maahi O Maahi O Maahi O Maahi<br>O Maahi O Maahi O Maahi O Maahi<br>Meri wafa pe haq hua tera...<br>Lo main qayamat tak hua tera....<br>Mere ishq pe haq hua tera....<br>Lo main qayamat tak hua tera....oh maahi....maahi re...<br><br><br>",
  "snippet" : "Yaara teri kahaani mein ho zikr mera"
}
```
