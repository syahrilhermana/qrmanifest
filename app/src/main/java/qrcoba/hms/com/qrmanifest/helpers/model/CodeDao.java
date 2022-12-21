package qrcoba.hms.com.qrmanifest.helpers.model;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Query;
import io.reactivex.Flowable;
import qrcoba.hms.com.qrmanifest.helpers.constant.TableNames;
import qrcoba.hms.com.qrmanifest.helpers.util.database.BaseDao;

@Dao

public interface CodeDao extends BaseDao<Code> {
    @Query("SELECT * FROM " + TableNames.CODES)
    Flowable<List<Code>> getAllFlowableCodes();

}
