package the.app.ethiocinema.databinding;
import the.app.ethiocinema.R;
import the.app.ethiocinema.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CinemaDetailViewBindingImpl extends CinemaDetailViewBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearLayout, 5);
        sViewsWithIds.put(R.id.callbutton, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CinemaDetailViewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private CinemaDetailViewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.LinearLayout) bindings[5]
            );
        this.cinemaDetailLocation.setTag(null);
        this.cinemaDetailPhone.setTag(null);
        this.cinemaDetailWeb.setTag(null);
        this.cinemaNameCx.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.OneCinema == variableId) {
            setOneCinema((the.app.ethiocinema.data.Cinema) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setOneCinema(@Nullable the.app.ethiocinema.data.Cinema OneCinema) {
        this.mOneCinema = OneCinema;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.OneCinema);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String oneCinemaName = null;
        java.lang.String oneCinemaPhone = null;
        java.lang.String oneCinemaLocation = null;
        the.app.ethiocinema.data.Cinema oneCinema = mOneCinema;
        java.lang.String oneCinemaWeblink = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (oneCinema != null) {
                    // read OneCinema.name
                    oneCinemaName = oneCinema.getName();
                    // read OneCinema.phone
                    oneCinemaPhone = oneCinema.getPhone();
                    // read OneCinema.location
                    oneCinemaLocation = oneCinema.getLocation();
                    // read OneCinema.weblink
                    oneCinemaWeblink = oneCinema.getWeblink();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cinemaDetailLocation, oneCinemaLocation);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cinemaDetailPhone, oneCinemaPhone);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cinemaDetailWeb, oneCinemaWeblink);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cinemaNameCx, oneCinemaName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): OneCinema
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}