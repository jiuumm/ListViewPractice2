package com.example.listviewpractice2
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.listviewpractice2.adpaters.StudentAdapter
import com.example.listviewpractice2.databinding.ActivityMainBinding
import com.example.listviewpractice2.datas.Student

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    val mStudentList = ArrayList<Student>()
    lateinit var mAdapter : StudentAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        mStudentList.add(Student("chab", 2000))
        mStudentList.add(Student("김철수", 1997))
        mStudentList.add(Student("정유리", 2002))
        mStudentList.add(Student("김짱구", 2003))
        mStudentList.add(Student("장소영", 2004))
        mStudentList.add(Student("유맹구", 1998))
        mStudentList.add(Student("장훈이", 1999))
//context:어떤 화면?, resID: 어떤 모양으로 뿌려줄까요? , mList:어떤 목록에 있는 애들을 뿌려줄까요?
        mAdapter = StudentAdapter(this, R.layout.student_list_item,mStudentList)


        binding.studentListView.adapter = mAdapter




    }
}