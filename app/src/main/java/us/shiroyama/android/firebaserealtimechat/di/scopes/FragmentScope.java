package us.shiroyama.android.firebaserealtimechat.di.scopes;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Fragment {@link Scope}
 *
 * @author Fumihiko Shiroyama (fu.shiroyama@gmail.com)
 */
@Scope
@Retention(RUNTIME)
public @interface FragmentScope {
}