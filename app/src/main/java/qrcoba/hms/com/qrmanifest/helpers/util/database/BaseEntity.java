package qrcoba.hms.com.qrmanifest.helpers.util.database;

import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;
import qrcoba.hms.com.qrmanifest.helpers.constant.ColumnNames;

public abstract class BaseEntity implements Parcelable {
    /**
     * Fields
     */
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ColumnNames.ID)
    @NonNull
    public long mId;

    /**
     * Getter and setter methods of the model
     */
    public long getId() {
        return mId;
    }
}
