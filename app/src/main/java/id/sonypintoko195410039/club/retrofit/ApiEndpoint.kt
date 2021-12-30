package id.sonypintoko195410039.club.retrofit

import id.sonypintoko195410039.club.MainModel
import retrofit2.Call
import retrofit2.http.GET

//untuk menghubungkan link api yang sudah dibuat
interface ApiEndpoint {
    @GET( "0564fec3-18a3-40a4-8e48-7394132f42c5")
    fun getData(): Call<MainModel>
}

