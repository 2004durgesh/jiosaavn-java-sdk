# Search

<h2>Methods</h2>

- [search](#search)


### search
> Note: This method is a subclass of the [`SearchService`](../src/main/java/com/jiosaavn/services/SearchService.java) class.


<h4>Parameters</h4>

| Parameter | Type     | Description           |
|-----------|----------|-----------------------|
| query     | `String` | query for the search. |

```java
public static void main(String[] args) {
    JioSaavnClient client = new JioSaavnClient();

    try {
        List<Search.SearchModel> search = client.searchService.search("Ram");
        System.out.println(JsonUtils.toJson(search));
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
```

returns a list of [`Search.SearchModel`](../src/main/java/com/jiosaavn/models/search.java) \
output:

```json
[
  {
    "albums": {
      "results": [
        {
          "id": "25500145",
          "title": "Ram Siya Ram",
          "image": [
            {
              "quality": "50x50",
              "url": "https://c.saavncdn.com/215/Ram-Siya-Ram-Hindi-2021-20210222031001-50x50.jpg"
            },
            {
              "quality": "150x150",
              "url": "https://c.saavncdn.com/215/Ram-Siya-Ram-Hindi-2021-20210222031001-150x150.jpg"
            },
            {
              "quality": "500x500",
              "url": "https://c.saavncdn.com/215/Ram-Siya-Ram-Hindi-2021-20210222031001-500x500.jpg"
            }
          ],
          "artist": "Sachet Tandon",
          "url": "https://www.jiosaavn.com/album/ram-siya-ram/cy9LsEw-pn0_",
          "type": "album",
          "description": "2021 · Hindi Album · Sachet Tandon",
          "year": "2021",
          "language": "hindi",
          "songIds": "HLulXlir"
        },
        {
          "id": "49602829",
          "title": "Ram Aayenge",
          "image": [
            {
              "quality": "50x50",
              "url": "https://c.saavncdn.com/336/Ram-Aayenge-Hindi-2023-20231108181532-50x50.jpg"
            },
            {
              "quality": "150x150",
              "url": "https://c.saavncdn.com/336/Ram-Aayenge-Hindi-2023-20231108181532-150x150.jpg"
            },
            {
              "quality": "500x500",
              "url": "https://c.saavncdn.com/336/Ram-Aayenge-Hindi-2023-20231108181532-500x500.jpg"
            }
          ],
          "artist": "Payal Dev, Vishal Mishra, Manoj Muntashir",
          "url": "https://www.jiosaavn.com/album/ram-aayenge/JXlb,rLRtAs_",
          "type": "album",
          "description": "2023 · Hindi Album · Payal Dev, Vishal Mishra, Manoj Muntashir",
          "year": "2023",
          "language": "hindi",
          "songIds": "D3YbEDXN"
        },
        {
          "id": "64794584",
          "title": "Ramayan Ka Saar",
          "image": [
            {
              "quality": "50x50",
              "url": "https://c.saavncdn.com/931/Ramayan-Ka-Saar-Haryanvi-2025-20250521141230-50x50.jpg"
            },
            {
              "quality": "150x150",
              "url": "https://c.saavncdn.com/931/Ramayan-Ka-Saar-Haryanvi-2025-20250521141230-150x150.jpg"
            },
            {
              "quality": "500x500",
              "url": "https://c.saavncdn.com/931/Ramayan-Ka-Saar-Haryanvi-2025-20250521141230-500x500.jpg"
            }
          ],
          "artist": "Masoom Sharma",
          "url": "https://www.jiosaavn.com/album/ramayan-ka-saar/oKe5CmXmc60_",
          "type": "album",
          "description": "2025 · Haryanvi Album · Masoom Sharma",
          "year": "2025",
          "language": "haryanvi",
          "songIds": "rmuZD_3H"
        }
      ],
      "position": 3
    },
    "songs": {
      "results": [
        {
          "id": "HLulXlir",
          "title": "Ram Siya Ram",
          "image": [
            {
              "quality": "50x50",
              "url": "https://c.saavncdn.com/215/Ram-Siya-Ram-Hindi-2021-20210222031001-50x50.jpg"
            },
            {
              "quality": "150x150",
              "url": "https://c.saavncdn.com/215/Ram-Siya-Ram-Hindi-2021-20210222031001-150x150.jpg"
            },
            {
              "quality": "500x500",
              "url": "https://c.saavncdn.com/215/Ram-Siya-Ram-Hindi-2021-20210222031001-500x500.jpg"
            }
          ],
          "album": "Ram Siya Ram",
          "url": "https://www.jiosaavn.com/song/ram-siya-ram/OCQeXSxcXkE",
          "type": "song",
          "description": "Ram Siya Ram · Sachet Tandon",
          "primary_artists": "Sachet Tandon",
          "language": "hindi",
          "singers": "Sachet Tandon"
        },
        {
          "id": "rmuZD_3H",
          "title": "Ramayan Ka Saar",
          "image": [
            {
              "quality": "50x50",
              "url": "https://c.saavncdn.com/931/Ramayan-Ka-Saar-Haryanvi-2025-20250521141230-50x50.jpg"
            },
            {
              "quality": "150x150",
              "url": "https://c.saavncdn.com/931/Ramayan-Ka-Saar-Haryanvi-2025-20250521141230-150x150.jpg"
            },
            {
              "quality": "500x500",
              "url": "https://c.saavncdn.com/931/Ramayan-Ka-Saar-Haryanvi-2025-20250521141230-500x500.jpg"
            }
          ],
          "album": "Ramayan Ka Saar",
          "url": "https://www.jiosaavn.com/song/ramayan-ka-saar/AgUeazBvBHs",
          "type": "song",
          "description": "Ramayan Ka Saar · Masoom Sharma",
          "primary_artists": "Masoom Sharma",
          "language": "haryanvi",
          "singers": "Masoom Sharma"
        },
        {
          "id": "dBM1AsPC",
          "title": "Ram Siya Ram",
          "image": [
            {
              "quality": "50x50",
              "url": "https://c.saavncdn.com/972/Adipurush-Hindi-2023-20230607184755-50x50.jpg"
            },
            {
              "quality": "150x150",
              "url": "https://c.saavncdn.com/972/Adipurush-Hindi-2023-20230607184755-150x150.jpg"
            },
            {
              "quality": "500x500",
              "url": "https://c.saavncdn.com/972/Adipurush-Hindi-2023-20230607184755-500x500.jpg"
            }
          ],
          "album": "Adipurush",
          "url": "https://www.jiosaavn.com/song/ram-siya-ram/FComADVDZ3A",
          "type": "song",
          "description": "Adipurush · Sachet-Parampara, Sachet Tandon, Parampara Tandon",
          "primary_artists": "Sachet-Parampara, Sachet Tandon, Parampara Tandon",
          "language": "hindi",
          "singers": "Sachet-Parampara, Sachet Tandon, Parampara Tandon"
        }
      ],
      "position": 4
    },
    "artists": {
      "results": [
        {
          "id": "666684",
          "title": "Ram Charan",
          "image": [
            {
              "quality": "50x50",
              "url": "https://c.saavncdn.com/artists/Ram_Charan_50x50.jpg"
            },
            {
              "quality": "150x150",
              "url": "https://c.saavncdn.com/artists/Ram_Charan_150x150.jpg"
            },
            {
              "quality": "500x500",
              "url": "https://c.saavncdn.com/artists/Ram_Charan_500x500.jpg"
            }
          ],
          "type": "artist",
          "description": "Actor",
          "position": "1"
        }
      ],
      "position": 2
    },
    "playlists": {
      "results": [
        {
          "id": "9403340",
          "title": "Ram",
          "image": [
            {
              "quality": "50x50",
              "url": "https://c.saavncdn.com/editorial/Ram_20241126052015_50x50.jpg"
            },
            {
              "quality": "150x150",
              "url": "https://c.saavncdn.com/editorial/Ram_20241126052015_150x150.jpg"
            },
            {
              "quality": "500x500",
              "url": "https://c.saavncdn.com/editorial/Ram_20241126052015_500x500.jpg"
            }
          ],
          "url": "https://www.jiosaavn.com/featured/ram/LBI1x3Qa6ew_",
          "type": "playlist",
          "description": "Saavn Editor",
          "language": "hindi"
        },
        {
          "id": "1170236741",
          "title": "Ram - JioTunes",
          "image": [
            {
              "quality": "50x50",
              "url": "https://c.saavncdn.com/editorial/RamJioTunesHindi_20230601180444_50x50.jpg"
            },
            {
              "quality": "150x150",
              "url": "https://c.saavncdn.com/editorial/RamJioTunesHindi_20230601180444_150x150.jpg"
            },
            {
              "quality": "500x500",
              "url": "https://c.saavncdn.com/editorial/RamJioTunesHindi_20230601180444_500x500.jpg"
            }
          ],
          "url": "https://www.jiosaavn.com/featured/ram-jiotunes/FKeROUSR,auPujkz47ksHQ__",
          "type": "playlist",
          "description": "Saavn Editor",
          "language": "hindi"
        },
        {
          "id": "1209137052",
          "title": "Ram Bhajans",
          "image": [
            {
              "quality": "50x50",
              "url": "https://c.saavncdn.com/editorial/RamBhajans_20241024072423_50x50.jpg"
            },
            {
              "quality": "150x150",
              "url": "https://c.saavncdn.com/editorial/RamBhajans_20241024072423_150x150.jpg"
            },
            {
              "quality": "500x500",
              "url": "https://c.saavncdn.com/editorial/RamBhajans_20241024072423_500x500.jpg"
            }
          ],
          "url": "https://www.jiosaavn.com/featured/ram-bhajans/rvEs7,4L1W5LBU7Q54OWwg__",
          "type": "playlist",
          "description": "Saavn Editor",
          "language": "hindi"
        }
      ],
      "position": 1
    },
    "topQuery": {
      "results": [
        {
          "id": "9403340",
          "title": "Ram",
          "image": [
            {
              "quality": "50x50",
              "url": "https://c.saavncdn.com/editorial/Ram_20241126052015_50x50.jpg"
            },
            {
              "quality": "150x150",
              "url": "https://c.saavncdn.com/editorial/Ram_20241126052015_150x150.jpg"
            },
            {
              "quality": "500x500",
              "url": "https://c.saavncdn.com/editorial/Ram_20241126052015_500x500.jpg"
            }
          ],
          "album": null,
          "url": "https://www.jiosaavn.com/featured/ram/LBI1x3Qa6ew_",
          "type": "playlist",
          "description": "Playlist",
          "primary_artists": null,
          "language": "hindi",
          "singers": null
        }
      ],
      "position": 0
    }
  }
]
```
