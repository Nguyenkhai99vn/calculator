package com.example.caculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ArrSo1 = ArrayList<Int>()
        var So: String = ""
        var temp: Int = 0
        var Number1: String = ""
        var Number2: String = ""
        var cong: Int = 0
        var tru: Int = 0
        var nhan: Int = 0
        var chia: Int = 0
        BT0.setOnClickListener(){
            ArrSo1.add(BT0.text.toString().toInt())
            temp = ArrSo1.size - 1
            So += ArrSo1.get(temp).toString()
            ViewKQ.text = So
        }
        BT1.setOnClickListener(){
            ArrSo1.add(BT1.text.toString().toInt())
            temp = ArrSo1.size - 1
            So += ArrSo1.get(temp).toString()
            ViewKQ.text = So
        }
        BT2.setOnClickListener(){
            ArrSo1.add(BT2.text.toString().toInt())
            temp = ArrSo1.size - 1
            So += ArrSo1.get(temp).toString()
            ViewKQ.text = So
        }
        BT3.setOnClickListener(){
            ArrSo1.add(BT3.text.toString().toInt())
            temp = ArrSo1.size - 1
            So += ArrSo1.get(temp).toString()
            ViewKQ.text = So
        }
        BT4.setOnClickListener(){
            ArrSo1.add(BT4.text.toString().toInt())
            temp = ArrSo1.size - 1
            So += ArrSo1.get(temp).toString()
            ViewKQ.text = So
        }
        BT5.setOnClickListener(){
            ArrSo1.add(BT5.text.toString().toInt())
            temp = ArrSo1.size - 1
            So += ArrSo1.get(temp).toString()
            ViewKQ.text = So
        }
        BT6.setOnClickListener(){
            ArrSo1.add(BT6.text.toString().toInt())
            temp = ArrSo1.size - 1
            So += ArrSo1.get(temp).toString()
            ViewKQ.text = So
        }
        BT7.setOnClickListener(){
            ArrSo1.add(BT7.text.toString().toInt())
            temp = ArrSo1.size - 1
            So += ArrSo1.get(temp).toString()
            ViewKQ.text = So
        }
        BT8.setOnClickListener(){
            ArrSo1.add(BT8.text.toString().toInt())
            temp = ArrSo1.size - 1
            So += ArrSo1.get(temp).toString()
            ViewKQ.text = So
        }
        BT9.setOnClickListener(){
            ArrSo1.add(BT9.text.toString().toInt())
            temp = ArrSo1.size - 1
            So += ArrSo1.get(temp).toString()
            ViewKQ.text = So
        }
        BTCong.setOnClickListener()  {
                temp = ArrSo1.size - 1
                for (i in 0..temp  )
                {
                    Number1 += ArrSo1.get(i).toString()
                }
                ArrSo1.clear()
                So = ""
                ViewKQ.text = "+"
                cong = 1
            }

        BTTru.setOnClickListener() {
            temp = ArrSo1.size - 1
            for (i in 0..temp) {
                Number1 += ArrSo1.get(i).toString()
            }
            ArrSo1.clear()
            So = ""
            ViewKQ.text = "-"
            tru = 1
        }
        BTNhan.setOnClickListener()  {
            temp = ArrSo1.size - 1
            for (i in 0..temp  )
            {
                Number1 += ArrSo1.get(i).toString()
            }
            ArrSo1.clear()
            So = ""
            ViewKQ.text = "*"
            nhan = 1
        }
        BTChia.setOnClickListener()  {
            temp = ArrSo1.size - 1
            for (i in 0..temp  )
            {
                Number1 += ArrSo1.get(i).toString()
            }
            ArrSo1.clear()
            So = ""
            ViewKQ.text = "/"
            chia = 1
        }

        BTDelAll.setOnClickListener(){
            ArrSo1.clear()
            So = ""
            temp= 0
            ViewKQ.text = "0"
            Number1= ""
            Number2= ""
            cong= 0
            tru= 0
            nhan= 0
            chia= 0
        }
        BTBang.setOnClickListener(){
            var tong: Int = 0
            var hieu: Int = 0
            var tich: Int = 0
            var thuong: Int = 0
            for(i in 0..temp) {
                Number2 += ArrSo1.get(i).toString()
            }
            ArrSo1.clear()
            if(cong.equals(1)) {
                tong = Number1.toInt() + Number2.toInt()
                ViewKQ.text = tong.toString()
                ArrSo1.add(tong)
                Number1 = ""
                Number2 = ""
                cong = 0
            }
            else if (tru.equals(1))
            {
                hieu = Number1.toInt() - Number2.toInt()
                ViewKQ.text = hieu.toString()
                ArrSo1.add(hieu)
                Number1 = ""
                Number2 = ""
                tru = 0
            }
            else if (nhan.equals(1))
            {
                tich = Number1.toInt() * Number2.toInt()
                ViewKQ.text = tich.toString()
                ArrSo1.add(tich)
                Number1 = ""
                Number2 = ""
                nhan = 0
            }
            else if (chia.equals(1))
            {
                thuong = Number1.toInt() * Number2.toInt()
                ViewKQ.text = thuong.toString()
                ArrSo1.add(thuong)
                Number1 = ""
                Number2 = ""
                chia = 0
            }
        }

    }

}


