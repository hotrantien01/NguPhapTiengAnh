package com.trantien.nguphaptienganh.Frm;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SearchView;

import com.trantien.nguphaptienganh.Adapter.AdapterMain;
import com.trantien.nguphaptienganh.DanhMucLession;
import com.trantien.nguphaptienganh.Model.ItemMain;
import com.trantien.nguphaptienganh.R;

import java.util.ArrayList;

public class FrmLession extends Fragment {
    ArrayList<ItemMain> arrayList;
    ArrayList<ItemMain> arrayListCopy;
    AdapterMain adapter;

    public FrmLession() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frm_lesson, container, false);
        setHasOptionsMenu(true);
        RecyclerView rv = view.findViewById(R.id.rv_lession);
        arrayList = new ArrayList();
        arrayListCopy = new ArrayList<>();
        new DanhMucLession(arrayList);
        arrayListCopy.addAll(arrayList);
        adapter = new AdapterMain(arrayList, getContext());
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        rv.setAdapter(adapter);
        return view;

    }

    // set chiều cao của list view cho cân đối với giao diện
    public void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            // pre-condition
            return;
        }

        int totalHeight = listView.getPaddingTop() + listView.getPaddingBottom();
        int desiredWidth = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), View.MeasureSpec.AT_MOST);
        for (int i = 0; i < listAdapter.getCount(); i++) {
            View listItem = listAdapter.getView(i, null, listView);

            if(listItem != null){
                // This next line is needed before you call measure or else you won't get measured height at all. The listitem needs to be drawn first to know the height.
                listItem.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT));
                listItem.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);
                totalHeight += listItem.getMeasuredHeight();

            }
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
        listView.requestLayout();
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.main, menu);
        MenuItem itemSearch = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) itemSearch.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                arrayList.clear();
                if (newText.equals("")) {
                    arrayList.addAll(arrayListCopy);
                } else {
                    for (ItemMain itemMain : arrayListCopy) {
                        if (itemMain.getName().toLowerCase().contains(newText)) {
                            arrayList.add(itemMain);
                        }
                    }
                }
                adapter.notifyDataSetChanged();
                return true;
            }
        });
        super.onCreateOptionsMenu(menu, inflater);
    }

}
