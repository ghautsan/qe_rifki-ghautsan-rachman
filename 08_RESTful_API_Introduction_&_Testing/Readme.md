Pengenalan RESTful API
- API = Application Programming Interface
- API memungkinkan komunikasi dan pertukaran data antara 2 atau lebih software/sistem yang terpisah

REST API
- REST = Representational State Transfer
- HTTP Method = GET, PUT, POST, DELETE
- REST API Component = Method, URL, Header, Body

- Approach of API Testing = - Mengerti fungsi dari API
			    - Dapat mengaplikasikan teknik testing
			    - Input Parameter untuk API perlu dirancanakan dan ditentukan sebelumnya
			    - Jalankan test case dan dibandingkan antara hasil yang diharapkan dengan hasil yang didapatkan

- What's API Testing = - API Test sangat berbeda dengan GUI
		       - Mengirim request dan mendapatkan responsenya
		       - Memverifikasi response yang benar dan error handling

Kind of API Tesing = Functionality, Load Test, Security

Advantages of Testing API = - Efisiensi waktu
			    - Bahasa yang independen
			    - Mengurangi biaya testing
			    - Mengurangi resiko

Challenges of API Testing = - Kombinasi parameter, pemilihan parameter
			    - Tidak ada GUI(Graphical User Interface)
			    - Kita harus mengetahui terlebih dahulu parameter
			    - Perlu juga mengetest error handling dari setiap API

Test Cases for API Testing = - Mendapatkan response yang sesuai dengan inputan
			     - Apakah memberikan response atau tidak
			     - Apakah mengganggu fitur yang lain atau tidak
			     - Update struktur data
			     - Memodifikasi data yang ada

Best Practices of API Testing = - Kelompokkan test case kedalam beberapa kategori
				- Beri judul yang sesuai pada setiap test
				- Harus berhati-hati ketika melakukan test yang berhubungan dengan mengahpus sesuatu
				- Ketika membuat test case harus dipikirkan juga segala kombinasi input pada API
