/**
 * PostItemAdapter.java
 * 
 * Adapter Class which configs and returns the View for ListView
 * 
 */
package gr.hua.dit.rssreader.adapter;

import java.util.ArrayList;

import gr.hua.dit.rssreader.R;
import gr.hua.dit.rssreader.vo.PostData;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class PostItemAdapter extends ArrayAdapter<PostData> {
	private LayoutInflater inflater;
	private ArrayList<PostData> datas;

	public PostItemAdapter(Context context, int textViewResourceId,
			ArrayList<PostData> objects) {
		super(context, textViewResourceId, objects);
		// TODO Auto-generated constructor stub
		inflater = ((Activity) context).getLayoutInflater();
		datas = objects;
	}

	static class ViewHolder {
		TextView postTitleView;
		TextView postDateView;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder viewHolder;
		//psesent the titles in the listView
		if (convertView == null) {
			convertView = inflater.inflate(R.layout.postitem, null);

			viewHolder = new ViewHolder();
			viewHolder.postTitleView = (TextView) convertView
					.findViewById(R.id.postTitleLabel);
			viewHolder.postDateView = (TextView) convertView
					.findViewById(R.id.postDateLabel);
			convertView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) convertView.getTag();
		}


		viewHolder.postTitleView.setText(datas.get(position).postTitle);
		viewHolder.postDateView.setText(datas.get(position).postDate);

		return convertView;
	}
}
