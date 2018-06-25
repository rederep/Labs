package ua.ictloud.lessons.java8.ImplDefaultClassOptional.Test;

import java.util.List;

class GenericList<T> implements ShowTst{
    private List<T> t;

    public GenericList(List<T> t) {
        this.t = t;
    }
}
