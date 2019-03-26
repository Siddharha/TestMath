package `in`.creativelizard.testmath

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    lateinit var numberArray: ArrayList<Int>
    lateinit var mathUtil : MathUtil
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initalize()
        onActionPerform()
    }

    private fun initalize() {
        numberArray = ArrayList()
        mathUtil = MathUtil()
    }

    private fun onActionPerform() {
        btnRun.setOnClickListener {
            numberArray.clear()
            tvDisplay.text = ""

            val arrString = etInput.text.toString()
                .replace("[","")
                .replace("]","")



            val realArray = arrString.split(",")

            for(itm in realArray){
                numberArray.add(itm.toInt())

           }

            val k =numberArray.toIntArray()
            Arrays.sort(k)

            //val intArray = ArrayList<Int>()


            Log.e("sh",Arrays.toString(k))
            tvDisplay.text = mathUtil.minDiff(k).toString()

        }
    }

}
