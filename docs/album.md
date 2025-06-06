# Album

<h2>Methods</h2>

- [getAlbumById](#getAlbumById)


### getAlbumById
> Note: This method is a subclass of the [`AlbumService`](../src/main/java/com/jiosaavn/services/AlbumService.java) class.


<h4>Parameters</h4>

| Parameter | Type     | Description      |
|-----------|----------|------------------|
| id        | `String` | id of the album. |

```java
public static void main(String[] args) {
    JioSaavnClient client = new JioSaavnClient();

    try {
        Album.AlbumModel album = client.albumService.getAlbumById("1158245");
        System.out.println(JsonUtils.toJson(album));
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
```

returns a [`Album.AlbumModel`](../src/main/java/com/jiosaavn/models/album.java) \
output:

```json
{
  "id": "1158245",
  "name": "Ek Villain",
  "description": "2014 · Hindi Album · Various Artists",
  "year": 2014,
  "type": "album",
  "playCount": null,
  "language": "hindi",
  "explicitContent": false,
  "artists": {
    "primary_artists": [
      {
        "id": "455494",
        "name": "Various Artists",
        "role": "",
        "type": "artist",
        "image": [],
        "url": "https://www.jiosaavn.com/artist/various-artists-songs/ztKx8IUBme8_"
      }
    ],
    "featured_artists": [],
    "artists": [
      {
        "id": "455494",
        "name": "Various Artists",
        "role": "",
        "type": "artist",
        "image": [],
        "url": "https://www.jiosaavn.com/artist/various-artists-songs/ztKx8IUBme8_"
      }
    ]
  },
  "songCount": 4,
  "url": "https://www.jiosaavn.com/album/ek-villain/HR757XLeV10_",
  "image": [
    {
      "quality": "50x50",
      "url": "https://c.saavncdn.com/151/Ek-Villain-Hindi-2014-50x50.jpg"
    },
    {
      "quality": "150x150",
      "url": "https://c.saavncdn.com/151/Ek-Villain-Hindi-2014-150x150.jpg"
    },
    {
      "quality": "500x500",
      "url": "https://c.saavncdn.com/151/Ek-Villain-Hindi-2014-500x500.jpg"
    }
  ],
  "songs": [
    {
      "id": "rj7iikje",
      "name": "Galliyan",
      "type": "song",
      "year": "2014",
      "releaseDate": "2014",
      "duration": 341,
      "label": "T-Series",
      "explicitContent": false,
      "playCount": 65774362,
      "language": "hindi",
      "hasLyrics": true,
      "lyricsId": "rj7iikje",
      "url": "https://www.jiosaavn.com/song/galliyan/AgJcWB1bXVY",
      "copyright": "©  2014 T-Series",
      "album": {
        "id": "1158245",
        "name": "Ek Villain",
        "url": "https://www.jiosaavn.com/album/ek-villain/HR757XLeV10_"
      },
      "artists": {
        "primary_artists": [
          {
            "id": "484852",
            "name": "Ankit Tiwari",
            "role": "primary_artists",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Ankit_Tiwari_002_20241004072220_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Ankit_Tiwari_002_20241004072220_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Ankit_Tiwari_002_20241004072220_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/ankit-tiwari-songs/eHCWDfgAqlg_"
          }
        ],
        "featured_artists": [],
        "artists": [
          {
            "id": "484852",
            "name": "Ankit Tiwari",
            "role": "music",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Ankit_Tiwari_002_20241004072220_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Ankit_Tiwari_002_20241004072220_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Ankit_Tiwari_002_20241004072220_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/ankit-tiwari-songs/eHCWDfgAqlg_"
          },
          {
            "id": "484852",
            "name": "Ankit Tiwari",
            "role": "singer",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Ankit_Tiwari_002_20241004072220_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Ankit_Tiwari_002_20241004072220_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Ankit_Tiwari_002_20241004072220_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/ankit-tiwari-songs/eHCWDfgAqlg_"
          },
          {
            "id": "473441",
            "name": "Manoj Muntashir",
            "role": "lyricist",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/manoj-muntashir-songs/eaiDjU0BhyA_"
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
            "id": "477854",
            "name": "Shraddha Kapoor",
            "role": "starring",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Shraddha_Kapoor_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Shraddha_Kapoor_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Shraddha_Kapoor_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/shraddha-kapoor-songs/97qRLkdq3gI_"
          },
          {
            "id": "468470",
            "name": "Riteish Deshmukh",
            "role": "starring",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Riteish_Deshmukh_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Riteish_Deshmukh_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Riteish_Deshmukh_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/riteish-deshmukh-songs/CewovvdYHlg_"
          }
        ]
      },
      "image": [
        {
          "quality": "50x50",
          "url": "https://c.saavncdn.com/151/Ek-Villain-Hindi-2014-50x50.jpg"
        },
        {
          "quality": "150x150",
          "url": "https://c.saavncdn.com/151/Ek-Villain-Hindi-2014-150x150.jpg"
        },
        {
          "quality": "500x500",
          "url": "https://c.saavncdn.com/151/Ek-Villain-Hindi-2014-500x500.jpg"
        }
      ],
      "downloadUrl": [
        {
          "quality": "12kbps",
          "url": "http://aac.saavncdn.com/151/83d9815e1d6129ff644dc9575ef6db7e_12.mp4"
        },
        {
          "quality": "48kbps",
          "url": "http://aac.saavncdn.com/151/83d9815e1d6129ff644dc9575ef6db7e_48.mp4"
        },
        {
          "quality": "96kbps",
          "url": "http://aac.saavncdn.com/151/83d9815e1d6129ff644dc9575ef6db7e_96.mp4"
        },
        {
          "quality": "160kbps",
          "url": "http://aac.saavncdn.com/151/83d9815e1d6129ff644dc9575ef6db7e_160.mp4"
        },
        {
          "quality": "320kbps",
          "url": "http://aac.saavncdn.com/151/83d9815e1d6129ff644dc9575ef6db7e_320.mp4"
        }
      ]
    },
    {
      "id": "TyNCNCum",
      "name": "Banjaara",
      "type": "song",
      "year": "2014",
      "releaseDate": "2014",
      "duration": 337,
      "label": "T-Series",
      "explicitContent": false,
      "playCount": 62076836,
      "language": "hindi",
      "hasLyrics": true,
      "lyricsId": "TyNCNCum",
      "url": "https://www.jiosaavn.com/song/banjaara/JBElcjpzQl4",
      "copyright": "©  2014 T-Series",
      "album": {
        "id": "1158245",
        "name": "Ek Villain",
        "url": "https://www.jiosaavn.com/album/ek-villain/HR757XLeV10_"
      },
      "artists": {
        "primary_artists": [
          {
            "id": "702592",
            "name": "Mithoon",
            "role": "primary_artists",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Mithoon_002_20200908073735_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Mithoon_002_20200908073735_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Mithoon_002_20200908073735_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/mithoon-songs/nQKQiNRsTKs_"
          },
          {
            "id": "743983",
            "name": "Mohammed Irfan",
            "role": "primary_artists",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Mohammed_Irfan_006_20241118064435_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Mohammed_Irfan_006_20241118064435_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Mohammed_Irfan_006_20241118064435_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/mohammed-irfan-songs/yaf,eQp2Wcs_"
          }
        ],
        "featured_artists": [],
        "artists": [
          {
            "id": "702592",
            "name": "Mithoon",
            "role": "music",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Mithoon_002_20200908073735_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Mithoon_002_20200908073735_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Mithoon_002_20200908073735_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/mithoon-songs/nQKQiNRsTKs_"
          },
          {
            "id": "743983",
            "name": "Mohammed Irfan",
            "role": "singer",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Mohammed_Irfan_006_20241118064435_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Mohammed_Irfan_006_20241118064435_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Mohammed_Irfan_006_20241118064435_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/mohammed-irfan-songs/yaf,eQp2Wcs_"
          },
          {
            "id": "702592",
            "name": "Mithoon",
            "role": "lyricist",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Mithoon_002_20200908073735_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Mithoon_002_20200908073735_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Mithoon_002_20200908073735_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/mithoon-songs/nQKQiNRsTKs_"
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
            "id": "477854",
            "name": "Shraddha Kapoor",
            "role": "starring",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Shraddha_Kapoor_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Shraddha_Kapoor_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Shraddha_Kapoor_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/shraddha-kapoor-songs/97qRLkdq3gI_"
          },
          {
            "id": "468470",
            "name": "Riteish Deshmukh",
            "role": "starring",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Riteish_Deshmukh_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Riteish_Deshmukh_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Riteish_Deshmukh_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/riteish-deshmukh-songs/CewovvdYHlg_"
          }
        ]
      },
      "image": [
        {
          "quality": "50x50",
          "url": "https://c.saavncdn.com/151/Ek-Villain-Hindi-2014-50x50.jpg"
        },
        {
          "quality": "150x150",
          "url": "https://c.saavncdn.com/151/Ek-Villain-Hindi-2014-150x150.jpg"
        },
        {
          "quality": "500x500",
          "url": "https://c.saavncdn.com/151/Ek-Villain-Hindi-2014-500x500.jpg"
        }
      ],
      "downloadUrl": [
        {
          "quality": "12kbps",
          "url": "http://aac.saavncdn.com/151/d47f0f0edf55c1ec4ea5633b1ff1ba49_12.mp4"
        },
        {
          "quality": "48kbps",
          "url": "http://aac.saavncdn.com/151/d47f0f0edf55c1ec4ea5633b1ff1ba49_48.mp4"
        },
        {
          "quality": "96kbps",
          "url": "http://aac.saavncdn.com/151/d47f0f0edf55c1ec4ea5633b1ff1ba49_96.mp4"
        },
        {
          "quality": "160kbps",
          "url": "http://aac.saavncdn.com/151/d47f0f0edf55c1ec4ea5633b1ff1ba49_160.mp4"
        },
        {
          "quality": "320kbps",
          "url": "http://aac.saavncdn.com/151/d47f0f0edf55c1ec4ea5633b1ff1ba49_320.mp4"
        }
      ]
    },
    {...},
  ]
}
```
