package id.sonypintoko195410039.club
//deklarasi
data class MainModel ( val result: ArrayList<Result> ){
    data class Result ( val id: Int, val title: String, val image: String)
}