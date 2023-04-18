public abstract class Computer {

    Model model;
    public abstract void type();

    public void show_model(){
        model.display_model();
    }
    public void set_model(Model m){
        model = m;
    }
    public Model get_model(){
        return model;
    }
}
