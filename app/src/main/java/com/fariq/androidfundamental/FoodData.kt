package com.fariq.androidfundamental

object FoodData {

    private val names = arrayOf(
        "Nasi Goreng",
        "Nasi Gudeg",
        "Nasi Pecel",
        "Nasi Rendang",
        "Nasi Sate",
        "Nasi Rawon",
        "Nasi Campur",
        "Rujak Cingur",
        "Soto",
        "Bakso"
    )

    private val kkal = intArrayOf(
            330,
            300,
            230,
            450,
            320,
            300,
            500,
            250,
            300,
            400
    )
    private val prices = doubleArrayOf(
            10000.0,
            12000.0,
            9000.0,
            15000.0,
            13000.0,
            12000.0,
            13000.0,
            10000.0,
            10000.0,
            15000.0
    )

    private val descriptions = arrayOf(
            "Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng, margarin, atau mentega. Biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bumbu-bumbu lainnya; seperti telur, ayam, dan kerupuk. Ada pula nasi goreng jenis lain yang dibuat bersama ikan asin yang juga populer di seluruh Indonesia. Nasi goreng juga dikenal sebagai masakan nasional Indonesia. Dari sekian banyak hidangan dalam khazanah Masakan Indonesia, hanya sedikit yang dapat dianggap sebagai makanan nasional sejati. Masakan nasional Indonesia ini tidak mengenal batasan kelas sosial. Nasi goreng dapat dinikmati secara sederhana di warung tepi jalan, gerobak penjaja keliling, hingga restoran dan meja prasmanan dalam pesta",
            "Gudeg adalah makanan khas Provinsi Yogyakarta dan Jawa Tengah yang terbuat dari nangka muda yang dimasak dengan santan. Perlu waktu berjam-jam untuk membuat masakan ini. Warna coklat biasanya dihasilkan oleh daun jati yang dimasak bersamaan. Gudeg biasanya dimakan dengan nasi dan disajikan dengan kuah santan kental (areh), ayam kampung, telur, tempe, tahu dan sambal goreng krecek.",
            "Nasi Pecel merupakan makanan yang dikombinasikan dengan bumbu sambal kacang sebagai bahan utamanya dan dicampur dengan aneka jenis sayuran. Makanan ini populer terutama di wilayah DI Yogyakarta, Jawa Tengah, dan Jawa Timur. Asal nama dan asal daerah dari pecel belum diketahui secara pasti. Namun dapat dimaknai secara etimologi, dalam bahasa Jawa, bahwa pecel dapat diartikan sebagai 'tumbuk' atau 'dihancurkan dengan cara ditumbuk'. Ada angapan Pecel itu berasal dari Ponorogo, Jawa Timur,[1] karena sambal kacang yang digunakan dalam campuran pecel juga digunakan dalam bumbu sate Ponorogo.[2] [3] Makanan ini juga mirip dengan gado-gado yang membedakannya adalah campuran bahan dan tekstur bumbunya. Nama Pecel Madiun merupakan pecel yang paling terkenal di Indonesia.",
            "Nasi Rendang adalah masakan daging asli Indonesia yang berasal dari Minangkabau. Masakan ini dihasilkan dari proses memasak suhu rendah dalam waktu lama menggunakan aneka rempah-rempah dan santan. Proses memasaknya memakan waktu berjam-jam (biasanya sekitar empat jam) hingga yang tinggal hanyalah potongan daging berwarna hitam pekat dan dedak. Dalam suhu ruangan, rendang dapat bertahan hingga berminggu-minggu. Rendang yang dimasak dalam waktu yang lebih singkat dan santannya belum mengering disebut kalio, berwarna cokelat terang keemasan.",
            "Sate atau satai adalah makanan yang terbuat dari daging yang dipotong kecil-kecil dan ditusuk sedemikian rupa dengan tusukan lidi tulang daun kelapa atau bambu, kemudian dipanggang menggunakan bara arang kayu. Sate disajikan dengan berbagai macam bumbu yang bergantung pada variasi resep sate.[1] Daging yang dijadikan sate antara lain daging ayam, kambing, domba, sapi, babi, kelinci, kuda, dan lain-lain. Sate diketahui berasal dari Jawa, Indonesia, dan dapat ditemukan di mana saja di Indonesia dan telah dianggap sebagai salah satu masakan nasional Indonesia.",
            "Rawon adalah masakan Indonesia berupa sup daging berkuah hitam dengan campuran bumbu khas yang menggunakan kluwek. Rawon, meskipun dikenal sebagai masakan khas Jawa Timur (daerah Arekan), dikenal pula oleh masyarakat Jawa Tengah sebelah timur (daerah Surakarta). Daging untuk rawon umumnya adalah daging sapi yang dipotong kecil-kecil, utamanya adalah bagian sandung lamur. Bumbu supnya sangat khas Indonesia, yaitu campuran bawang merah, bawang putih, lengkuas (laos), ketumbar, kemiri, serai, kunir, cabai, kluwek, garam, serta minyak nabati. Semua bahan ini dihaluskan, lalu ditumis sampai harum. Campuran bumbu ini kemudian dimasukkan dalam kaldu rebusan daging bersama-sama dengan daging. Warna gelap khas rawon berasal dari kluwek. Di luar negeri, rawon disebut sebagai black soup.",
            "Nasi campur adalah masakan khas Indonesia. Makanan ini terdiri dari nasi putih yang dihidangkan dengan bermacam-macam lauk-pauk. Lauk yang digunakan adalah sambal goreng, abon, serundeng, tahu goreng, ikan goreng, telur dan lain-lain. Tergantung dari warung atau rumah makan yang menyajikannya nasi campur dapat memiliki variasi tersendiri. Masakan ini juga sering dijual dalam bungkus kertas atau daun pisang.",
            "Rujak cingur adalah salah satu makanan tradisional yang mudah ditemukan di daerah Jawa Timur, terutama di daerah asalnya Surabaya. Dalam bahasa Jawa kata cingur berarti \"mulut\", hal ini merujuk pada bahan irisan mulut atau moncong sapi yang direbus dan dicampurkan ke dalam hidangan. Rujak cingur biasanya terdiri dari irisan beberapa jenis buah seperti timun, kerahi (krai, yaitu sejenis timun khas Jawa Timur), bengkuang, mangga muda, nanas, kedondong, kemudian ditambah lontong, tahu, tempe, bendoyo, cingur, serta sayuran seperti kecambah/taoge, kangkung, dan kacang panjang. Semua bahan tadi dicampur dengan saus atau bumbu yang terbuat dari olahan petis udang, air matang untuk sedikit mengencerkan, gula/gula merah, cabai, kacang tanah yang digoreng, bawang goreng, garam, dan irisan tipis pisang biji hijau yang masih muda (pisang klutuk). Semua saus/bumbu dicampur dengan cara diulek, itu sebabnya rujak cingur juga sering disebut rujak ulek.",
            "Soto adalah makanan khas Indonesia seperti sop yang terbuat dari kaldu daging dan sayuran. Daging yang paling sering digunakan adalah daging sapi dan ayam, tetapi ada pula yang menggunakan daging babi atau kambing. Berbagai daerah di Indonesia memiliki soto khas daerahnya masing-masing dengan komposisi yang berbeda-beda, misalnya soto Madura, soto Kediri, soto Pemalang, soto Lamongan, soto Jepara, soto Semarang, soto Kudus, soto Betawi, soto Padang, soto Bandung, sroto Sokaraja, soto Banjar, soto Medan, dan coto Makassar. Soto juga diberi nama sesuai isinya, misalnya soto ayam, soto babat, atau soto kambing. Ada pula soto yang dibuat dari daging kaki sapi yang disebut dengan soto sekengkel.",
            "Bakso atau baso adalah jenis bola daging yang lazim ditemukan pada masakan Indonesia. Bakso umumnya dibuat dari campuran daging sapi giling dan tepung tapioka, tetapi ada juga bakso yang terbuat dari daging ayam, ikan, atau udang bahkan daging kerbau. Dalam penyajiannya, bakso umumnya disajikan panas-panas dengan kuah kaldu sapi bening, dicampur mi, bihun, taoge, tahu, terkadang telur lalu ditaburi bawang goreng dan seledri. Bakso sangat populer dan dapat ditemukan di seluruh Indonesia; dari gerobak pedagang kaki lima hingga restoran besar. Berbagai jenis bakso sekarang banyak ditawarkan dalam bentuk makanan beku yang dijual di pasar swalayan ataupun mal-mal. Irisan bakso dapat juga dijadikan pelengkap jenis makanan lain seperti mi goreng, nasi goreng, atau capcai."
    )

    private val images = intArrayOf(
            R.drawable.nasgor,
            R.drawable.gudeg,
            R.drawable.pecel,
            R.drawable.rendang,
            R.drawable.sate,
            R.drawable.rawon,
            R.drawable.nasi_campur,
            R.drawable.rujak_cingur,
            R.drawable.soto,
            R.drawable.bakso
    )

    val listData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in names.indices) {
                val food = Food()
                food.name = names[position]
                food.kkal = kkal[position]
                food.price = prices[position]
                food.image = images[position]
                food.desc = descriptions[position]
                food.favorite = false
                list.add(food)

            }
            return list
        }
}