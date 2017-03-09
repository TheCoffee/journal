package in.ghostcode.journal;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Coffee on 3/5/17.
 */

public class RecyclerViewEntryAdapter extends RecyclerView.Adapter<RecyclerViewEntryAdapter.ViewHolder> {
    private ArrayList<Entry> mEntries = new ArrayList<>();
    private Context mContext;

    public RecyclerViewEntryAdapter(Context context, ArrayList<Entry> entries) {
        mContext = context;
        mEntries = entries;
    }

    @Override
    public RecyclerViewEntryAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_entry, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewEntryAdapter.ViewHolder holder, int position) {
        Entry entry = mEntries.get(position);
        holder.tvTitle.setText(entry.getTitle());
        holder.tvContent.setText(entry.getContent());
        holder.tvDate.setText(entry.getDate());
    }

    @Override
    public int getItemCount() {
        return mEntries.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle, tvContent, tvDate;
        public ViewHolder(View itemView) {
            super(itemView);
            tvTitle = (TextView) itemView.findViewById(R.id.entry_title);
            tvContent = (TextView) itemView.findViewById(R.id.entry_content);
            tvDate = (TextView) itemView.findViewById(R.id.entry_date);
        }
    }
}
