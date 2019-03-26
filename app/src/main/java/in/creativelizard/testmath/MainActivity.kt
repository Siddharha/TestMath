package `in`.creativelizard.testmath

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    lateinit var numberArray: ArrayList<Int>
    lateinit var mathUtil : MathUtil
    lateinit var ans:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initalize()
        onActionPerform()
    }

    private fun initalize() {
        numberArray = ArrayList()
        mathUtil = MathUtil()

        (rgOperation.getChildAt(0) as RadioButton).isChecked = true
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
            if((rgOperation.getChildAt(0) as RadioButton).isChecked){
              ans = mathUtil.minDiff(k).toString()
            }else{
                /*val ta = k.toTypedArray()
                Arrays.sort(ta,Collections.reverseOrder())
               // Arrays.asList(ta).reverse()
                Log.e("sh",Arrays.toString(ta))*/

                val zz = Math.abs(k[k.size-1] - k[0])
                ans = zz.toString()
                //Log.e("sh",Arrays.toString(k))
            }
            tvDisplay.text = ans

        }
    }

}
