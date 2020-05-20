package com.kitahukomputer.artiskorea

object ArtisData {
    private val artisNames = arrayOf(
        "IU",
        "Kim Hyun-joo",
        "Kim So-hyun",
        "Park Shin-hye",
        "Son Ye-jin",
        "Song Hye-kyo",
        "Suzy",
        "Park Bo-young",
        "Park Min-young",
        "Choi Ji-woo",
        "Ha Ji-won",
        "Kim Tae-hee",
        "Jun Ji-hyun",
        "Park Soo-ae",
        "Han Hyo-joo"
    )

    private val artisImages = intArrayOf(
        R.drawable.iu,
        R.drawable.kim_hyun_joo,
        R.drawable.kim_so_hyun,
        R.drawable.park_shin_hye,
        R.drawable.son_ye_jin,
        R.drawable.song_hye_kyo,
        R.drawable.suzy,
        R.drawable.park_bo_young,
        R.drawable.park_min_young,
        R.drawable.choi_ji_woo,
        R.drawable.ha_ji_won,
        R.drawable.kim_tae_hee,
        R.drawable.jun_ji_hyum,
        R.drawable.park_soo_ae,
        R.drawable.han_hyo_joo
    )

    private val artisDetails = arrayOf(
        "Artis bertalenta IU menempati posisi pertama artis tercantik sepanjang masa versi King Choice. Pemeran utama dalam drama populer Hotel Del Luna ini memang begitu dicintai masyarakat Korea Selatan.",
        "Kim Hyun-joo adalah salah satu seleb senior yang lahir pada 24 April 1977. Meski usianya sudah menginjak 42 tahun, Kim Hyun-joo terpilih di urutan kedua artis tercantik sepanjang masa.",
        "Kim So-hyun yang lahir pada 4 Juni 1999 ini adalah seorang aktris, pembawa acara, sekaligus model. Kim So-hyun yang kini berusia 20 tahun mengawali kariernya sebagai aktris cilik ketika berusia tujuh tahun, dan mulai dikenal publik pada tahun 2012 saat bermain dalam drama Moon Embracing the Sun.",
        "Park Shin-hye memang kerap jadi langganan bintang utama di berbagai judul drama Korea. Wanita cantik kelahiran 18 Februari 1990 ini menempati posisi keempat artis Korea tercantik sepanjang masa.",
        "Lawan main Hyun Bin dalam drama Korea hits Crash Landing on You, Son Ye-jin menempati posisi kelima artis tercantik Korea sepanjang masa. Meski usianya sudah menginjak 38 tahun, Son Ye-jin masih memesona hingga kini.",
        "Kecantikan Song Hye-kyo memang nggak perlu diragukan lagi. Mantan istri Song Joong-ki ini masih begitu cantik dan menawan di usianya yang sudah menginjak 38 tahun.",
        "Ada mantan kekasih Lee Min-ho, Bae Suzy. Suzy mulai debut di dunia hiburan Korea Selatan pada tahun 2010 sebagai member girlband Miss A. Tahun-tahun selanjutnya Suzy mulai tampil sebagai MC, model sekaligus bermain dalam drama-drama populer Korea Selatan.",
        "Disini ada artis cantik Park Bo-young. Wanita kelahiran 12 Februari 1990 ini kerap membintangi drama Korea hits seperti Oh My Ghostess (2015) dan Strong Woman Do Bong-soon (2017).",
        "Di usianya yang sudah menginjak 34 tahun, Park Min-young masih terlihat begitu menawan bak artis muda. Park Min-young dikenal lewat drama-drama hitsnya seperti Sungkyunkwan Scandal (2010), City Hunter (2011), Glory Jane (2011), Dr Jin (2012), Healer (2014-2015), Remember - War of the Son (2015-2016) dan What's Wrong with Secretary Kim (2018).",
        "Artis cantik yang bermain dalam drama Korea legendaris Winter Sonata ini berada di posisi kesepuluh artis Korea tercantik sepanjang masa. Meski sudah berusia 44 tahun, Choi Ji-woo tetap memesona hingga kini.",
        "Meski Ha Ji-won sudah berusia 41 tahun, kecantikan pemeran Gil Ra-im dalam Secret Garden ini tak pernah luntur hingga kini.",
        "Istri dari aktor sekaligus penyanyi Rain, Kim Tae-hee juga masuk dalam jajaran artis Korea tercantik sepanjang masa. Ibu dua anak ini masih terlihat begitu anggun dan menawan di usianya yang sudah menginjak 40 tahun.",
        "Artis cantik Jun Ji-hyun begitu memikat penonton lewat akting apiknya di drama Korea My Love from the Star dan Legend of the Blue Sea. Pada usianya yang memasuki 38 tahun, Jun Ji-hyun tetap menjadi sorotan hingga kini.",
        "Park Soo-ae yang lahir pada 25 Juli 1979 ini memulai kariernya di televisi dan terkenal lewat perannya di drama Emperor of the Sea (2004), A Thousand Days' Promise (2011), Queen of Ambition (2013) dan Mask (2015).",
        "Han Hyo-joo adalah artis cantik kelahiran Cheongju, 22 Februari 1987. Han Hyo-joo dikenal melalui perannya di Spring Waltz (2006), Brilliant Legacy (2009), Dong Yi (2010), dan W (2016). Selain itu dia juga bermain dalam film bertajuk Cold Eyes (2013) yang berhasil membawanya memenangkan penghargaan Aktris Terbaik di Penghargaan Film Blue Dragon ke-34."
    )

    val listData: ArrayList<Artis>
        get() {
            val list = arrayListOf<Artis>()
            for (position in artisNames.indices) {
                val artis = Artis()
                artis.name = artisNames[position]
                artis.detail = artisDetails[position]
                artis.photo = artisImages[position]
                list.add(artis)
            }
            return list
        }
}