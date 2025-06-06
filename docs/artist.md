# Artist

<h2>Methods</h2>

- [getArtistById](#getArtistById)


### getArtistById
> Note: This method is a subclass of the [`ArtistService`](../src/main/java/com/jiosaavn/services/ArtistService.java) class.


<h4>Parameters</h4>

| Parameter | Type     | Description       |
|-----------|----------|-------------------|
| id        | `String` | id of the artist. |

```java
public static void main(String[] args) {
    JioSaavnClient client = new JioSaavnClient();

    try {
        Artist.ArtistModel artist = client.artistService.getArtistById("456323");
        //getArtistById(String id, int page, int songCount, int albumCount, SortBy sortBy, SortOrder sortOrder)
            /*
            * public enum SortBy {
        POPULARITY, LATEST, ALPHABETICAL
    }

    public enum SortOrder {
        ASC, DESC
    }*/
        System.out.println(JsonUtils.toJson(artist));
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
```

returns a [`Artist.ArtistModel`](../src/main/java/com/jiosaavn/models/artists/Artist.java) \
output:

```json
{
  "id": "456323",
  "name": "Pritam",
  "url": "https://www.jiosaavn.com/artist/pritam/OaFg9HPZgq8_",
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
  "followerCount": 24721140,
  "fanCount": null,
  "isVerified": false,
  "dominantLanguage": "hindi",
  "dominantType": null,
  "bio": [
    {
      "text": "Pritam Chakraborty is a music director composer from Kolkata who saw a spectacular rise to fame with release of the movie Dhoom (2004). Songs like Dhoom Machale to the more recent Main Rang Sharbaton Ka, characterize his musical style as a delicate fusion of Indian classical music with western influences. His style shifts from Sufi notes (Once Upon Time in Mumbai) to Ghazal rhythms (Barfi).",
      "title": "Introduction",
      "sequence": 1
    },
    {
      "text": "Pritamâ€™s father Probodh Chakraborty, who ran a music school for children, trained Pritam on how to play the guitar. During his time at Presidency College, he was a member of Bangla bands like Chandrabindu and Jotugriher Pakhi. In 1993, he joined the Film and Television Institute, Pune to undertake a course in sound engineering, wherein he got a chance to compose background music for a film by Hungarian filmmaker Istvan Gaal. In between, he also managed to learn African music from Kedar Avati. Soon after he finished his course, he moved to Mumbai with Bollywood in his mind. In Mumbai, he teamed up with Sanjay Gadhvi, Shantanu Moitra, Rajkumar Hirani, and Chandrajeet Ganguly. When Gadhvi signed up to direct the movie Tere Liye (2000), Pritam and Chandrajeet (also known as Jeet) joined in as music composers, forming the Jeet-Pritam duo. The music won appreciation, but the film was a flop at the box office. In 2002, Gadhvi once again signed up to direct the movie Mere Yaar Ki Shaadi Hai, in which all songs composed by the Jeet-Pritam duo became chartbusters. After this, Pritam did one composition with Jeet for the movie Mudda-The Issue (2003) before they parted amicably. Later he composed for films like Fun 2shh - Dudes In The 10th Century (2003) and Agnipankh (2004) which did not fare well.",
      "title": "Early Life",
      "sequence": 2
    },
    {
      "text": "Pritam had built a name for his compositions by finely blending Indian classical music with western influences. His compositions for Gadhviâ€™s second movie Dhoom (2004) were a runaway hit. He followed this up with compositions for films like Chocolate (2005), Garam Masala (2005) and Gangster (2006), Dhoom-2 (2006) and Life in a Metro (2007). At about this time he also formed his own band called Metro. Next up, his series of films included Bhool Bhulaiyaa (2007), Awarapan (2007), Dhan Dhana Dhan Goal (2007), Jab We Met (2007), Naqaab (2007) & many more.\r\n\r\nHe then went on to compose for more recent films like Singh is Kinng (2008), Kismat Konnection (2008), Billu (2009), Golmaal Returns (2008), Tum Mile (2009), Ajab Prem Ki Ghazab Kahani (2009), De Dana Dan (2009), Badmaash Company (2010), Rajneeti (2010), Once Upon a Time in Mumbai (2010), Crook (2010), Action Replayy (2010), Golmaal 3(2010). In 2011, he composed for the films Dil Toh Baccha Hai Ji, Dum Maro Dum, Ready, Mausam, Desi Boyz and Players. In 2012, he scored for the films Agent Vinod, Jannat 2, Ferrari Ki Sawaari, Cocktail, and Barfi. By 2013, his list included Race 3, Murder 3, Yeh Jawani Hai Deewani, Once Upon a Time in Mumbai Doobara, Phata Poster Nikla Hero, and Dhoom 3. He started the year 2014 with compositions for Yaariyan going on to Shaadi Ke Side Effects and Holiday. His upcoming films include White Lies, Phantom, Roy, Jagga Jasoos, and Badtameez Dil.",
      "title": "Rise To Fame",
      "sequence": 3
    },
    {
      "text": "â€¢ Filmfare Awards: \r\n\tBest Music Director and Best Background Score for Barfi (2012)\r\nâ€¢ Zee Cine Awards: \r\n\tBest Music Director for Cocktail (2013), \r\n\tBest Background Score and Best Music Director for Yeh Jawaani Hai Deewani (2014)\r\nâ€¢ IIFA Awards: \r\n\tBest Music Director for Love Aaj Kal (2010)\r\nâ€¢ Apsara Film Producers Guild Awards: \r\n\tBest Music Director for Yeh Jawaani Hai Deewani (2014), \r\n\tBest Music Director for Cocktail (2013), \r\n\tBest Music Director for Jab We Met (2008)",
      "title": "Awards",
      "sequence": 4
    },
    {
      "text": "He mentored and judged Sa Re Ga Ma Pa Challenge 2009 and was a judge for Chhote Ustaad on Zee TV. He was also a guest judge for the X factor and Zee Bangla SaReGaMaPa 2012-13. He also composed the track for Hrithik Roshanâ€™s TV series Just Dance for Star TV.",
      "title": "Televison",
      "sequence": 5
    },
    {
      "text": "1. Main Rang Sharbaton Ka â€“ Phata Poster Nikla Hero\r\n2. Subha Hone Na De - Desi Boyz\r\n3. Lat Lag Gayee â€“ Race 2\r\n4. Tum Hi Ho Bandhu - Cocktail\r\n5. Tu Mere Agal Bagal Hai - Phata Poster Nikla Hero\r\n6. Party On My Mind - Race 2\r\n7. Malangâ€“Dhoom 3\r\n8. Be Intehaan - Race 2\r\n9. Teri Jhuki Nazar - Murder 3 (2013)\r\n10. Kamli â€“ Dhoom 3",
      "title": "Top 10 Hit Songs",
      "sequence": 6
    }
  ],
  "dob": "14-06-1971",
  "fb": "https://www.facebook.com/Pritam",
  "twitter": "https://twitter.com/ipritamofficial",
  "wiki": "http://en.wikipedia.org/wiki/Pritam_Chakraborty",
  "availableLanguages": ["hindi","tamil","bengali",],
  "isRadioPresent": true,
  "topSongs": [
    {
      "id": "e1CHBWtx",
      "name": "Zamaana Lage (From &quot;Metro ... In Dino&quot;)",
      "type": "song",
      "year": "2025",
      "releaseDate": "2025",
      "duration": 196,
      "label": "T-Series",
      "explicitContent": false,
      "playCount": 0,
      "language": "hindi",
      "hasLyrics": false,
      "lyricsId": "e1CHBWtx",
      "url": "https://www.jiosaavn.com/song/zamaana-lage-from-metro-...-in-dino/FVkoeTZnQ0s",
      "copyright": "℗ 2025 Super Cassettes Industries Private Limited",
      "album": {
        "id": "64971760",
        "name": "Zamaana Lage (From &quot;Metro ... In Dino&quot;)",
        "url": "https://www.jiosaavn.com/album/zamaana-lage-from-metro-...-in-dino/IWLJGn157KI_"
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
            "id": "909299",
            "name": "Shashwat Singh",
            "role": "primary_artists",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Shashwat_Singh_003_20241223092611_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Shashwat_Singh_003_20241223092611_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Shashwat_Singh_003_20241223092611_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/shashwat-singh-songs/gJthH4uEIuI_"
          },
          {
            "id": "11405388",
            "name": "Qaisar Ul Jaffari",
            "role": "primary_artists",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/qaisar-ul-jaffari-songs/rClrqRYUeTk_"
          },
          {
            "id": "465560",
            "name": "Sandeep Shrivastava",
            "role": "primary_artists",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/sandeep-shrivastava-songs/hsqdJX7zATQ_"
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
            "id": "909299",
            "name": "Shashwat Singh",
            "role": "singer",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Shashwat_Singh_003_20241223092611_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Shashwat_Singh_003_20241223092611_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Shashwat_Singh_003_20241223092611_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/shashwat-singh-songs/gJthH4uEIuI_"
          },
          {
            "id": "11405388",
            "name": "Qaisar Ul Jaffari",
            "role": "lyricist",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/qaisar-ul-jaffari-songs/rClrqRYUeTk_"
          },
          {
            "id": "465560",
            "name": "Sandeep Shrivastava",
            "role": "lyricist",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/sandeep-shrivastava-songs/hsqdJX7zATQ_"
          },
          {
            "id": "669125",
            "name": "Aditya Roy Kapur",
            "role": "starring",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Aditya_Roy_Kapur_20201027070801_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Aditya_Roy_Kapur_20201027070801_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Aditya_Roy_Kapur_20201027070801_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/aditya-roy-kapur-songs/2rYodGIZ25w_"
          },
          {
            "id": "5607405",
            "name": "Sara Ali Khan",
            "role": "starring",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Sara_Ali_Khan_001_20240318125414_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Sara_Ali_Khan_001_20240318125414_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Sara_Ali_Khan_001_20240318125414_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/sara-ali-khan-songs/R8Muu,CMC78_"
          }
        ]
      },
      "image": [
        {
          "quality": "50x50",
          "url": "https://c.saavncdn.com/289/Zamaana-Lage-From-Metro-In-Dino-Hindi-2025-20250528161014-50x50.jpg"
        },
        {
          "quality": "150x150",
          "url": "https://c.saavncdn.com/289/Zamaana-Lage-From-Metro-In-Dino-Hindi-2025-20250528161014-150x150.jpg"
        },
        {
          "quality": "500x500",
          "url": "https://c.saavncdn.com/289/Zamaana-Lage-From-Metro-In-Dino-Hindi-2025-20250528161014-500x500.jpg"
        }
      ],
      "downloadUrl": [
        {
          "quality": "12kbps",
          "url": "http://aac.saavncdn.com/289/a6dfe6ea1700d52c64ea595ba35f95a5_12.mp4"
        },
        {
          "quality": "48kbps",
          "url": "http://aac.saavncdn.com/289/a6dfe6ea1700d52c64ea595ba35f95a5_48.mp4"
        },
        {
          "quality": "96kbps",
          "url": "http://aac.saavncdn.com/289/a6dfe6ea1700d52c64ea595ba35f95a5_96.mp4"
        },
        {
          "quality": "160kbps",
          "url": "http://aac.saavncdn.com/289/a6dfe6ea1700d52c64ea595ba35f95a5_160.mp4"
        },
        {
          "quality": "320kbps",
          "url": "http://aac.saavncdn.com/289/a6dfe6ea1700d52c64ea595ba35f95a5_320.mp4"
        }
      ]
    },
    {
      "id": "VQp1eXug",
      "name": "Zara Sa",
      "type": "song",
      "year": "2008",
      "releaseDate": "2008",
      "duration": 302,
      "label": "Sony Music Entertainment India Pvt. Ltd.",
      "explicitContent": false,
      "playCount": 0,
      "language": "hindi",
      "hasLyrics": false,
      "lyricsId": "VQp1eXug",
      "url": "https://www.jiosaavn.com/song/zara-sa/JjkbABFoQlQ",
      "copyright": "(P) 2008 Sony Music Entertainment India Pvt. Ltd.",
      "album": {
        "id": "1031998",
        "name": "Jannat (Original Motion Picture Soundtrack)",
        "url": "https://www.jiosaavn.com/album/jannat-original-motion-picture-soundtrack/bGnqYFTPFRU_"
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
            "id": "455782",
            "name": "KK",
            "role": "primary_artists",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/KK_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/KK_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/KK_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/kk-songs/K,5uNVM,qpM_"
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
            "id": "455782",
            "name": "KK",
            "role": "singer",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/KK_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/KK_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/KK_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/kk-songs/K,5uNVM,qpM_"
          },
          {
            "id": "669007",
            "name": "Sayeed Quadri",
            "role": "lyricist",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Sayeed_Quadri_001_20210616180918_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Sayeed_Quadri_001_20210616180918_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Sayeed_Quadri_001_20210616180918_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/sayeed-quadri-songs/CkMFUTAeb,c_"
          },
          {
            "id": "458251",
            "name": "Emraan Hashmi",
            "role": "starring",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Emraan_Hashmi_002_20230228120108_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Emraan_Hashmi_002_20230228120108_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Emraan_Hashmi_002_20230228120108_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/emraan-hashmi-songs/M4ByRDEAbdI_"
          },
          {
            "id": "474124",
            "name": "Sonal Chauhan",
            "role": "starring",
            "type": "artist",
            "image": [
              {
                "quality": "50x50",
                "url": "https://c.saavncdn.com/artists/Sonal_Chauhan_50x50.jpg"
              },
              {
                "quality": "150x150",
                "url": "https://c.saavncdn.com/artists/Sonal_Chauhan_150x150.jpg"
              },
              {
                "quality": "500x500",
                "url": "https://c.saavncdn.com/artists/Sonal_Chauhan_500x500.jpg"
              }
            ],
            "url": "https://www.jiosaavn.com/artist/sonal-chauhan-songs/guk6U4uf1BM_"
          }
        ]
      },
      "image": [
        {
          "quality": "50x50",
          "url": "https://c.saavncdn.com/801/Jannat-Hindi-2008-20190629135803-50x50.jpg"
        },
        {
          "quality": "150x150",
          "url": "https://c.saavncdn.com/801/Jannat-Hindi-2008-20190629135803-150x150.jpg"
        },
        {
          "quality": "500x500",
          "url": "https://c.saavncdn.com/801/Jannat-Hindi-2008-20190629135803-500x500.jpg"
        }
      ],
      "downloadUrl": [
        {
          "quality": "12kbps",
          "url": "http://aac.saavncdn.com/801/62e0268b27130432c3baee75bd7009fe_12.mp4"
        },
        {
          "quality": "48kbps",
          "url": "http://aac.saavncdn.com/801/62e0268b27130432c3baee75bd7009fe_48.mp4"
        },
        {
          "quality": "96kbps",
          "url": "http://aac.saavncdn.com/801/62e0268b27130432c3baee75bd7009fe_96.mp4"
        },
        {
          "quality": "160kbps",
          "url": "http://aac.saavncdn.com/801/62e0268b27130432c3baee75bd7009fe_160.mp4"
        },
        {
          "quality": "320kbps",
          "url": "http://aac.saavncdn.com/801/62e0268b27130432c3baee75bd7009fe_320.mp4"
        }
      ]
    },
    {...},
  ],
  "topAlbums": [
    {
      "id": "1031998",
      "name": "Jannat (Original Motion Picture Soundtrack)",
      "description": "",
      "year": 2008,
      "type": "album",
      "playCount": null,
      "language": "hindi",
      "explicitContent": false,
      "artists": {
        "primary_artists": [
          {
            "id": "456323",
            "name": "Pritam",
            "role": "primary_artists",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/pritam-songs/OaFg9HPZgq8_"
          }
        ],
        "featured_artists": [],
        "artists": [
          {
            "id": "456323",
            "name": "Pritam",
            "role": "music",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/pritam-songs/OaFg9HPZgq8_"
          },
          {
            "id": "474130",
            "name": "Kamran Ahmed",
            "role": "music",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/kamran-ahmed-songs/JbYoOffNwCo_"
          },
          {
            "id": "456323",
            "name": "Pritam",
            "role": "singers",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/pritam-songs/OaFg9HPZgq8_"
          },
          {
            "id": "456392",
            "name": "Richa Sharma",
            "role": "singers",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/richa-sharma-songs/VoLWFjaqUmg_"
          },
          {
            "id": "455782",
            "name": "KK",
            "role": "singers",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/kk-songs/K,5uNVM,qpM_"
          },
          {
            "id": "706757",
            "name": "Rana Mazumder",
            "role": "singers",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/rana-mazumder-songs/QONmogtBODc_"
          },
          {
            "id": "460059",
            "name": "Rupam Islam",
            "role": "singers",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/rupam-islam-songs/pnc046-P6Ys_"
          },
          {
            "id": "474130",
            "name": "Kamran Ahmed",
            "role": "singers",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/kamran-ahmed-songs/JbYoOffNwCo_"
          }
        ]
      },
      "songCount": 8,
      "url": "https://www.jiosaavn.com/album/jannat-original-motion-picture-soundtrack/bGnqYFTPFRU_",
      "image": [
        {
          "quality": "50x50",
          "url": "https://c.saavncdn.com/801/Jannat-Hindi-2008-20190629135803-50x50.jpg"
        },
        {
          "quality": "150x150",
          "url": "https://c.saavncdn.com/801/Jannat-Hindi-2008-20190629135803-150x150.jpg"
        },
        {
          "quality": "500x500",
          "url": "https://c.saavncdn.com/801/Jannat-Hindi-2008-20190629135803-500x500.jpg"
        }
      ],
      "songs": null
    },
    {
      "id": "49986024",
      "name": "ANIMAL",
      "description": "",
      "year": 2023,
      "type": "album",
      "playCount": null,
      "language": "hindi",
      "explicitContent": false,
      "artists": {
        "primary_artists": [
          {
            "id": "455494",
            "name": "Various Artists",
            "role": "primary_artists",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/various-artists-songs/ztKx8IUBme8_"
          }
        ],
        "featured_artists": [],
        "artists": [
          {
            "id": "746774",
            "name": "Manan Bhardwaj",
            "role": "music",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/manan-bhardwaj-songs/PHyqUR9DoKY_"
          },
          {
            "id": "2663500",
            "name": "JAM8",
            "role": "music",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/jam8-songs/JAdIelXlNlQ_"
          },
          {
            "id": "820935",
            "name": "Shreyas Puranik",
            "role": "music",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/shreyas-puranik-songs/QG8EBD6VNSk_"
          },
          {
            "id": "4795470",
            "name": "Harshavardhan Rameshwar",
            "role": "music",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/harshavardhan-rameshwar-songs/viqEpjXvKPU_"
          },
          {
            "id": "702452",
            "name": "Vishal Mishra",
            "role": "music",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/vishal-mishra-songs/f0sXoS0mUnE_"
          },
          {
            "id": "680475",
            "name": "Jaani",
            "role": "music",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/jaani-songs/a0Vk-AlzJu8_"
          },
          {
            "id": "5935170",
            "name": "Ashim Kemson",
            "role": "music",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/ashim-kemson-songs/kvjj71I9Wdo_"
          },
          {
            "id": "746774",
            "name": "Manan Bhardwaj",
            "role": "singers",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/manan-bhardwaj-songs/PHyqUR9DoKY_"
          },
          {
            "id": "457160",
            "name": "Bhupinder Babbal",
            "role": "singers",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/bhupinder-babbal-songs/D1d8yWBOJsE_"
          },
          {
            "id": "7436979",
            "name": "Raghav Chaitanya",
            "role": "singers",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/raghav-chaitanya-songs/WZZxrSnCG6o_"
          },
          {
            "id": "473441",
            "name": "Manoj Muntashir",
            "role": "singers",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/manoj-muntashir-songs/eaiDjU0BhyA_"
          },
          {
            "id": "456323",
            "name": "Pritam",
            "role": "singers",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/pritam-songs/OaFg9HPZgq8_"
          },
          {
            "id": "459320",
            "name": "Arijit Singh",
            "role": "singers",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/arijit-singh-songs/LlRWpHzy3Hk_"
          },
          {
            "id": "820935",
            "name": "Shreyas Puranik",
            "role": "singers",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/shreyas-puranik-songs/QG8EBD6VNSk_"
          },
          {
            "id": "677149",
            "name": "Siddharth-Garima",
            "role": "singers",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/siddharth-garima-songs/ftVD5tjFzrs_"
          },
          {
            "id": "455125",
            "name": "Sonu Nigam",
            "role": "singers",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/sonu-nigam-songs/,kuQK6K6u0I_"
          },
          {
            "id": "4795470",
            "name": "Harshavardhan Rameshwar",
            "role": "singers",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/harshavardhan-rameshwar-songs/viqEpjXvKPU_"
          },
          {
            "id": "671644",
            "name": "Raj Shekhar",
            "role": "singers",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/raj-shekhar-songs/aPqBdDe5m,8_"
          },
          {
            "id": "702452",
            "name": "Vishal Mishra",
            "role": "singers",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/vishal-mishra-songs/f0sXoS0mUnE_"
          },
          {
            "id": "455130",
            "name": "Shreya Ghoshal",
            "role": "singers",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/shreya-ghoshal-songs/lIHlwHaxTZ0_"
          },
          {
            "id": "680475",
            "name": "Jaani",
            "role": "singers",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/jaani-songs/a0Vk-AlzJu8_"
          },
          {
            "id": "788130",
            "name": "B Praak",
            "role": "singers",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/b-praak-songs/CfABr-vmQdw_"
          },
          {
            "id": "5935170",
            "name": "Ashim Kemson",
            "role": "singers",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/ashim-kemson-songs/kvjj71I9Wdo_"
          }
        ]
      },
      "songCount": 8,
      "url": "https://www.jiosaavn.com/album/animal/8Ps4qqBA6,Y_",
      "image": [
        {
          "quality": "50x50",
          "url": "https://c.saavncdn.com/092/ANIMAL-Hindi-2023-20231124191036-50x50.jpg"
        },
        {
          "quality": "150x150",
          "url": "https://c.saavncdn.com/092/ANIMAL-Hindi-2023-20231124191036-150x150.jpg"
        },
        {
          "quality": "500x500",
          "url": "https://c.saavncdn.com/092/ANIMAL-Hindi-2023-20231124191036-500x500.jpg"
        }
      ],
      "songs": null
    },
    {...}
  ],
  "singles": [
    {
      "id": "36552397",
      "name": "Kesariya (From \"Brahmastra\")",
      "type": "album",
      "year": "2022",
      "releaseDate": "2022",
      "duration": null,
      "label": null,
      "explicitContent": false,
      "playCount": 0,
      "language": "hindi",
      "hasLyrics": false,
      "lyricsId": "36552397",
      "url": "https://www.jiosaavn.com/album/kesariya-from-brahmastra/3RMVXHzqov8_",
      "copyright": null,
      "album": {
        "id": null,
        "name": null,
        "url": null
      },
      "artists": {
        "primary_artists": [
          {
            "id": "456323",
            "name": "Pritam",
            "role": "primary_artists",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/pritam-songs/OaFg9HPZgq8_"
          },
          {
            "id": "459320",
            "name": "Arijit Singh",
            "role": "primary_artists",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/arijit-singh-songs/LlRWpHzy3Hk_"
          },
          {
            "id": "458681",
            "name": "Amitabh Bhattacharya",
            "role": "primary_artists",
            "type": "artist",
            "image": [],
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
            "image": [],
            "url": "https://www.jiosaavn.com/artist/pritam-songs/OaFg9HPZgq8_"
          },
          {
            "id": "456323",
            "name": "Pritam",
            "role": "singers",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/pritam-songs/OaFg9HPZgq8_"
          },
          {
            "id": "459320",
            "name": "Arijit Singh",
            "role": "singers",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/arijit-singh-songs/LlRWpHzy3Hk_"
          },
          {
            "id": "458681",
            "name": "Amitabh Bhattacharya",
            "role": "singers",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/amitabh-bhattacharya-songs/hsNRL6ZmJmo_"
          },
          {
            "id": "12841161",
            "name": "Pritam",
            "role": "singers",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/pritam-songs/ES25qtjiVmo_"
          },
          {
            "id": "",
            "name": "Arijit Singh & Amitabh Bhattacharya",
            "role": "singers",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/arijit-singh-amitabh-bhattacharya-songs/"
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
      "downloadUrl": []
    },
    {
      "id": "48893728",
      "name": "Ammayi (From \"ANIMAL\") [Telugu]",
      "type": "album",
      "year": "2023",
      "releaseDate": "2023",
      "duration": null,
      "label": null,
      "explicitContent": false,
      "playCount": 0,
      "language": "telugu",
      "hasLyrics": false,
      "lyricsId": "48893728",
      "url": "https://www.jiosaavn.com/album/ammayi-from-animal-telugu/9Gdc95W29dM_",
      "copyright": null,
      "album": {
        "id": null,
        "name": null,
        "url": null
      },
      "artists": {
        "primary_artists": [
          {
            "id": "7436979",
            "name": "Raghav Chaitanya",
            "role": "primary_artists",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/raghav-chaitanya-songs/WZZxrSnCG6o_"
          },
          {
            "id": "456746",
            "name": "Anantha Sriram",
            "role": "primary_artists",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/anantha-sriram-songs/PcZ7QTA-ErU_"
          },
          {
            "id": "456323",
            "name": "Pritam",
            "role": "primary_artists",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/pritam-songs/OaFg9HPZgq8_"
          },
          {
            "id": "2663500",
            "name": "JAM8",
            "role": "primary_artists",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/jam8-songs/JAdIelXlNlQ_"
          }
        ],
        "featured_artists": [],
        "artists": [
          {
            "id": "456323",
            "name": "Pritam",
            "role": "music",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/pritam-songs/OaFg9HPZgq8_"
          },
          {
            "id": "7436979",
            "name": "Raghav Chaitanya",
            "role": "singers",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/raghav-chaitanya-songs/WZZxrSnCG6o_"
          },
          {
            "id": "456746",
            "name": "Anantha Sriram",
            "role": "singers",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/anantha-sriram-songs/PcZ7QTA-ErU_"
          },
          {
            "id": "456323",
            "name": "Pritam",
            "role": "singers",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/pritam-songs/OaFg9HPZgq8_"
          },
          {
            "id": "2663500",
            "name": "JAM8",
            "role": "singers",
            "type": "artist",
            "image": [],
            "url": "https://www.jiosaavn.com/artist/jam8-songs/JAdIelXlNlQ_"
          }
        ]
      },
      "image": [
        {
          "quality": "50x50",
          "url": "https://c.saavncdn.com/565/Ammayi-From-ANIMAL-Telugu-Telugu-2023-20231011081003-50x50.jpg"
        },
        {
          "quality": "150x150",
          "url": "https://c.saavncdn.com/565/Ammayi-From-ANIMAL-Telugu-Telugu-2023-20231011081003-150x150.jpg"
        },
        {
          "quality": "500x500",
          "url": "https://c.saavncdn.com/565/Ammayi-From-ANIMAL-Telugu-Telugu-2023-20231011081003-500x500.jpg"
        }
      ],
      "downloadUrl": []
    },
    {...},
  ],
  "similarArtists": [
    {
      "id": "455669",
      "name": "Vishal Dadlani",
      "url": "https://www.jiosaavn.com/artist/vishal-dadlani-songs/6o-AMde03I8_",
      "image": [
        {
          "quality": "50x50",
          "url": "https://c.saavncdn.com/artists/Vishal_Dadlani.png"
        },
        {
          "quality": "150x150",
          "url": "https://c.saavncdn.com/artists/Vishal_Dadlani.png"
        },
        {
          "quality": "500x500",
          "url": "https://c.saavncdn.com/artists/Vishal_Dadlani.png"
        }
      ],
      "languages": {
        "kashmiri": "2",
        "telugu": "61",
        "english": "117",
        "marathi": "32",
        "punjabi": "28",
        "spanish": "18",
        "kannada": "10",
        "instrumental": "1",
        "gujarati": "15",
        "hindi": "4159",
        "bengali": "9",
        "unknown": "60",
        "malayalam": "7",
        "arabic": "1",
        "tamil": "112",
        "bhojpuri": "2"
      },
      "wiki": "https://en.wikipedia.org/wiki/Vishal_Dadlani",
      "dob": "28-06-1973",
      "fb": "",
      "twitter": "",
      "isRadioPresent": true,
      "type": "artist",
      "dominantType": "singer",
      "aka": "",
      "bio": null
    },
    {
      "id": "455280",
      "name": "Shankar-Ehsaan-Loy",
      "url": "https://www.jiosaavn.com/artist/shankar-ehsaan-loy-songs/gaOQwwdJkNo_",
      "image": [
        {
          "quality": "50x50",
          "url": "https://c.saavncdn.com/artists/Shankar_Ehsaan_Loy_002_20231107064353_50x50.jpg"
        },
        {
          "quality": "150x150",
          "url": "https://c.saavncdn.com/artists/Shankar_Ehsaan_Loy_002_20231107064353_150x150.jpg"
        },
        {
          "quality": "500x500",
          "url": "https://c.saavncdn.com/artists/Shankar_Ehsaan_Loy_002_20231107064353_500x500.jpg"
        }
      ],
      "languages": {
        "telugu": "62",
        "marathi": "45",
        "punjabi": "46",
        "kannada": "2",
        "instrumental": "4",
        "odia": "1",
        "hindi": "2187",
        "bengali": "6",
        "english": "7",
        "malayalam": "5",
        "tamil": "67",
        "bhojpuri": "1"
      },
      "wiki": "",
      "dob": "",
      "fb": "",
      "twitter": "",
      "isRadioPresent": true,
      "type": "artist",
      "dominantType": "music director",
      "aka": "",
      "bio": null
    },
    {...},
  ]
}
```
