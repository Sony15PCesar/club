package id.sonypintoko195410039.club.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiService {

    //untuk mengubungkan API yang diapakai
    val BASE_URL: String = "https://run.mocky.io/v3/"
    val endpoint: ApiEndpoint
        get() {
            val retrofit = Retrofit.Builder()
                .baseUrl( BASE_URL )
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit.create( ApiEndpoint::class.java )
        }
}