// "Create expected function in common module proj_Common" "true"
// SHOULD_FAIL_WITH: Cannot generate expected class
// DISABLE-ERRORS

import java.util.ArrayList

actual fun <T> <caret>createList(): ArrayList<T> = ArrayList()