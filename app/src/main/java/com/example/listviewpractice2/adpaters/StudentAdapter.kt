package com.example.listviewpractice2.adpaters

import android.content.Context
import android.widget.ArrayAdapter
import com.example.listviewpractice2.datas.Student

//어떤 종류의 데이터를 받아서 화면에 뿌려줄지? Student데이터를 뿌릴 거이므로!
class StudentAdapter(val mContext:Context,
                     val resID:Int,
                     val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resID, mList){





}A