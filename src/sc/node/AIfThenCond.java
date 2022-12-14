/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.node;

import sc.analysis.*;

@SuppressWarnings("nls")
public final class AIfThenCond extends PCond
{
    private TIf _if_;
    private PExpr _expr_;
    private TThen _then_;
    private PBloc _bloc_;

    public AIfThenCond()
    {
        // Constructor
    }

    public AIfThenCond(
        @SuppressWarnings("hiding") TIf _if_,
        @SuppressWarnings("hiding") PExpr _expr_,
        @SuppressWarnings("hiding") TThen _then_,
        @SuppressWarnings("hiding") PBloc _bloc_)
    {
        // Constructor
        setIf(_if_);

        setExpr(_expr_);

        setThen(_then_);

        setBloc(_bloc_);

    }

    @Override
    public Object clone()
    {
        return new AIfThenCond(
            cloneNode(this._if_),
            cloneNode(this._expr_),
            cloneNode(this._then_),
            cloneNode(this._bloc_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIfThenCond(this);
    }

    public TIf getIf()
    {
        return this._if_;
    }

    public void setIf(TIf node)
    {
        if(this._if_ != null)
        {
            this._if_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._if_ = node;
    }

    public PExpr getExpr()
    {
        return this._expr_;
    }

    public void setExpr(PExpr node)
    {
        if(this._expr_ != null)
        {
            this._expr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expr_ = node;
    }

    public TThen getThen()
    {
        return this._then_;
    }

    public void setThen(TThen node)
    {
        if(this._then_ != null)
        {
            this._then_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._then_ = node;
    }

    public PBloc getBloc()
    {
        return this._bloc_;
    }

    public void setBloc(PBloc node)
    {
        if(this._bloc_ != null)
        {
            this._bloc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._bloc_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._if_)
            + toString(this._expr_)
            + toString(this._then_)
            + toString(this._bloc_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._if_ == child)
        {
            this._if_ = null;
            return;
        }

        if(this._expr_ == child)
        {
            this._expr_ = null;
            return;
        }

        if(this._then_ == child)
        {
            this._then_ = null;
            return;
        }

        if(this._bloc_ == child)
        {
            this._bloc_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._if_ == oldChild)
        {
            setIf((TIf) newChild);
            return;
        }

        if(this._expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        if(this._then_ == oldChild)
        {
            setThen((TThen) newChild);
            return;
        }

        if(this._bloc_ == oldChild)
        {
            setBloc((PBloc) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
