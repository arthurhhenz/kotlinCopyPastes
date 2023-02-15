     
    /*
         Function that hides a keyboard
         https://stackoverflow.com/questions/55505049/how-to-close-the-soft-keyboard-from-a-fragment-using-kotlin
         Posted in Aug 24th 2017.
     */
     

    fun Fragment.hideKeyboard() {
        view?.let { activity?.hideKeyboard(it) }
    }

    fun Activity.hideKeyboard() {
        hideKeyboard(currentFocus ?: View(this))
    }

    @SuppressLint("ServiceCast")
    fun Context.hideKeyboard(view: View) {
        val inputMethodManager =
            getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }
