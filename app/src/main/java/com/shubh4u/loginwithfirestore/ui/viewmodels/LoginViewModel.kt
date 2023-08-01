package com.shubh4u.loginwithfirestore.ui.viewmodels
import android.content.Context
import android.widget.Toast
import androidx.lifecycle.ViewModel
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.shubh4u.loginwithfirestore.utills.ProjectUtil

class LoginViewModel : ViewModel() {

    fun register(email :String,password :String ,context :Context ){
       // ProjectUtil.sh(mContext, true, getString(R.string.please_wait))

        FirebaseAuth.getInstance().signInWithEmailAndPassword(email,password)
            .addOnCompleteListener { task ->
            if(task.isSuccessful){
              //  Toast.makeText(context,,Toast.LENGTH_LONG).show()
getuserdetails(task,context)
            }
        }.addOnFailureListener { exception ->
                if (exception.localizedMessage?.
                    contains("There is no user record corresponding to this identifier")
                    == true){
                    FirebaseAuth.getInstance().createUserWithEmailAndPassword(email,password)
                        .addOnCompleteListener { task ->
                            if(task.isSuccessful){
                                /*val intent= Intent(this,MainActivity::class.java)
                                startActivity(intent)
                                finish()*/
                                Toast.makeText(context,task.isSuccessful.toString(),Toast.LENGTH_LONG).show()

                            }
                        }.addOnFailureListener {exception ->{

                        }}
                }else{
                    Toast.makeText(context,exception.localizedMessage,Toast.LENGTH_LONG).show()

                }
        }
    }

    private fun getuserdetails(task: Task<AuthResult>, context: Context) {


    }

}