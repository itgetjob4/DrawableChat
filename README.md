# DrawableChat
This library is used to make chat effect like facebook and instagram,it can give gradient effect or drawable to message background with just few lines of code.It is made with the help of this <a href="https://noties.io/blog/2019/04/23/gradientmessenger/index.html">
 Blog.</a>

<h2>Have a look to the demonstration</h2>
        
<img src="https://noties.io/assets/images/gradient-messenger-round-2.png" width="400">

<h2>Steps to use</h2>

<h3>1. Create config object</h3>
  val config = Config(ContextCompat.getDrawable(this@MainActivity,R.drawable.crop)!!,      
            GradientDrawable(resources.getIntArray(R.array.list_gradient_color)))

<h3>2. Add decoration to recycler view</h3>
  myRecycler.addItemDecoration(MyDecoration(config, ViewType.LEFT,ViewType.RIGHT ,true))

<h3>3. Implement DecViewHolder to your viewholder class</h3>


