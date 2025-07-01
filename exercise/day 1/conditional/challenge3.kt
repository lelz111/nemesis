fun main(){
    val username = readLine()
    val password = readLine()

    if(username == "admin" && password == "1234"){
        println("Login berhasil!")
    }else{
        println("Username/password salah.")
    }
}