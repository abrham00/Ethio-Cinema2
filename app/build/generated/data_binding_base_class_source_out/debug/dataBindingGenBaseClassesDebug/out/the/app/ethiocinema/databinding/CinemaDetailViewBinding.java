package the.app.ethiocinema.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import java.lang.Deprecated;
import java.lang.Object;
import the.app.ethiocinema.data.Cinema;

public abstract class CinemaDetailViewBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton callbutton;

  @NonNull
  public final TextView cinemaDetailLocation;

  @NonNull
  public final TextView cinemaDetailPhone;

  @NonNull
  public final TextView cinemaDetailWeb;

  @NonNull
  public final TextView cinemaNameCx;

  @NonNull
  public final LinearLayout linearLayout;

  @Bindable
  protected Cinema mOneCinema;

  protected CinemaDetailViewBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton callbutton, TextView cinemaDetailLocation, TextView cinemaDetailPhone,
      TextView cinemaDetailWeb, TextView cinemaNameCx, LinearLayout linearLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.callbutton = callbutton;
    this.cinemaDetailLocation = cinemaDetailLocation;
    this.cinemaDetailPhone = cinemaDetailPhone;
    this.cinemaDetailWeb = cinemaDetailWeb;
    this.cinemaNameCx = cinemaNameCx;
    this.linearLayout = linearLayout;
  }

  public abstract void setOneCinema(@Nullable Cinema OneCinema);

  @Nullable
  public Cinema getOneCinema() {
    return mOneCinema;
  }

  @NonNull
  public static CinemaDetailViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.cinema_detail_view, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static CinemaDetailViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<CinemaDetailViewBinding>inflateInternal(inflater, the.app.ethiocinema.R.layout.cinema_detail_view, root, attachToRoot, component);
  }

  @NonNull
  public static CinemaDetailViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.cinema_detail_view, null, false, component)
   */
  @NonNull
  @Deprecated
  public static CinemaDetailViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<CinemaDetailViewBinding>inflateInternal(inflater, the.app.ethiocinema.R.layout.cinema_detail_view, null, false, component);
  }

  public static CinemaDetailViewBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static CinemaDetailViewBinding bind(@NonNull View view, @Nullable Object component) {
    return (CinemaDetailViewBinding)bind(component, view, the.app.ethiocinema.R.layout.cinema_detail_view);
  }
}
