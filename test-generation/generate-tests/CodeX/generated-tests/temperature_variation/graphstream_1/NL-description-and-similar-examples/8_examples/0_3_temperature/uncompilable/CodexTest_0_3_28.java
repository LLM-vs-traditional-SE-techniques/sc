import org.graphstream.graph.*;
import java.util.Collection;
import java.util.List;
import java.util.Stack;
import java.util.logging.Logger;
import java.util.stream.Stream;

import org.graphstream.graph.Graph;
import org.graphstream.graph.Path;
import org.graphstream.graph.implementations.DefaultGraph;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_3_28 { 
    @Test
    public void testContains() {
        Path path = new Path();
        path.add(new Edge("a", "b", "a->b"));
        path.add(new Edge("b", "c", "b->c"));
        path.add(new Edge("c", "d", "c->d"));
        path.add(new Edge("d", "e", "d->e"));
        path.add(new Edge("e", "f", "e->f"));
        path.add(new Edge("f", "g", "f->g"));
        path.add(new Edge("g", "h", "g->h"));
        path.add(new Edge("h", "i", "h->i"));
        path.add(new Edge("i", "j", "i->j"));
        path.add(new Edge("j", "k", "j->k"));
        path.add(new Edge("k", "l", "k->l"));
        path.add(new Edge("l", "m", "l->m"));
        path.add(new Edge("m", "n", "m->n"));
        path.add(new Edge("n", "o", "n->o"));
        path.add(new Edge("o", "p", "o->p"));
        path.add(new Edge("p", "q", "p->q"));
        path.add(new Edge("q", "r", "q->r"));
        path.add(new Edge("r", "s", "r->s"));
        path.add(new Edge("s", "t", "s->t"));
        path.add(new Edge("t", "u", "t->u"));
        path.add(new Edge("u", "v", "u->v"));
        path.add(new Edge("v", "w", "v->w"));
        path.add(new Edge("w", "x", "w->x"));
        path.add(new Edge("x", "y", "x->y"));
}