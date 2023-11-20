
package com.example.advokit.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.advokit.R;
import com.example.advokit.adapter.MyAdapter;
import com.example.advokit.adapter.hireAdapter;
import com.example.advokit.dataClass.DataClass;

import java.util.ArrayList;
import java.util.List;


        public class homeFragment extends Fragment {
            RecyclerView recyclerView;
            List<DataClass> dataList;
            MyAdapter adapter;


            @Override
            public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                     Bundle savedInstanceState) {

                return inflater.inflate(R.layout.fragment_home, container, false);


            }

            @Override
            public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
                super.onViewCreated(view, savedInstanceState);
                List<DataClass> data = new ArrayList<>();
                recyclerView = view.findViewById(R.id.recyclerView);

                recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                recyclerView.setAdapter(new MyAdapter(getContext(), data));





                data.add(new DataClass("Motor Vehicle Act 1988", R.string.motor, R.drawable.cons_one));
                data.add(new DataClass("Criminal Procedure Code",R.string.criminal_procedure,R.drawable.cons_two));
                data.add(new DataClass("Indian Penal Code ",R.string.indian_penal_code, R.drawable.cons_fourteen));
                data.add(new DataClass("Indian Sarais Act , 1887",R.string.sarais_act,R.drawable.cons_four));
                data.add(new DataClass("Motor Vehicle Act ,1988", R.string.motor, R.drawable.cons_one));
                data.add(new DataClass("Home Violence Act,2005",R.string.home_violence, R.drawable.cons_six));
               data.add(new DataClass("Police Act,1861",R.string.police_act_1861,R.drawable.cons_seven));
                data.add(new DataClass("Maternity Profit Act, 1961", R.string.materimony_profit ,R.drawable.cons_eight));
                data.add(new DataClass("Earning Tax Act,1961", R.string.earning_tax,R.drawable.cons_nine));
                data.add(new DataClass("Hindu Marriage Act, part-13", R.string.hin_marriage_part_13, R.drawable.cons_ten));
                data.add(new DataClass("Code of Legal process,1973", R.string.code_of_legal, R.drawable.cons_fourteen));
                data.add(new DataClass("As per citizen constitution (Indian oil company  web site )", R.string.as_per_citigen , R.drawable.cons_twelve));
                data.add(new DataClass("Automotive(Modification) Invoice , 2016", R.string.automotive_invoice,R.drawable.cons_three));
                data.add(new DataClass("Limitation Act, 1963", R.string.limitation_act, R.drawable.cons_fifteen));
                data.add(new DataClass("Part 294 of the Indian Penal Code", R.string.indian_penal_code, R.drawable.cons_eighteen));
                data.add(new DataClass("Hindu Adoption and Upkeep Act, 1956", R.string.hindu_Adaption_1956, R.drawable.cons_seventeen));
                data.add(new DataClass("Indian Farmers Law 2020", R.string.farmer_law, R. drawable.cons_sixteen));
                data.add(new DataClass("Right to Information (RTI) Act, 2005", R.string.right_to_informatition, R.drawable.cons_fourtynine));
                data.add(new DataClass("Right to Equality", R.string.right_to_equality, R. drawable.twentytwo));
                data.add(new DataClass("Right to Education, 2009",R.string.right_to_education, R.drawable.cons_twentyfour));

                data.add(new DataClass("Right to File an FIR Section 154 of CrPC",R.string.right_to_file_fir, R. drawable.cons_twentyseven));
                data.add(new DataClass("Right to Claim a Refund Consumer Protection Act, 1986", R.string.refund,R.drawable.cons_twentynine));
                data.add(new DataClass("Most Retail Value Act, 2014", R.string.most_retail_value_act, R.drawable.cons_three));

                data.add(new DataClass("Equal Remuneration Act, 1976",R.string.equal_remuneration, R.drawable.twentytwo));

                data.add(new DataClass("Rights of a Woman When Arrested (Section 46 of CrPC)",R.string.right_of_when_arrested, R.drawable.cons_thirtyfive));
               data.add(new DataClass("Right to Take Legal Action if Keys Snatched (Motor Vehicle Act of 1988)",R.string.key,R.drawable.cons_twentyseven));
                data.add(new DataClass("Maternity Benefit Act of 1961 (Section 12)", R.string.maternity_benifit,R.drawable.cons_thirtyeight));
               data.add(new DataClass("Hindu Marriage Act, Section 13",R.string.hindu_marrige_act, R.drawable.cons_ten));
                data.add(new DataClass("Income Tax Act of 1961", R.string.incom_tax,R.drawable.cons_nine));
               data.add(new DataClass("Right to Information (RTI) Act, 2005, Section 1",R.string.right_to_informatition, R.drawable.cons_fourtynine));

            }
        }
