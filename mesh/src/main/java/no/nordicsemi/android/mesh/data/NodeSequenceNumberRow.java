package no.nordicsemi.android.mesh.data;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;

public class NodeSequenceNumberRow {
    @NonNull
    @ColumnInfo(name = "uuid")
    private final String uuid;

    @ColumnInfo(name = "seq_number")
    private final int sequenceNumber;

    NodeSequenceNumberRow(@NonNull String uuid, int sequenceNumber) {
        this.uuid = uuid;
        this.sequenceNumber = sequenceNumber;
    }

    @NonNull
    public String getUuid() {
        return uuid;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }
}
