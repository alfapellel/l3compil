/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.node;

import sc.analysis.*;

@SuppressWarnings("nls")
public final class AAdditionAdsous extends PAdsous
{
    private PAdsous _adsous_;
    private TPlus _plus_;
    private PMultdiv _multdiv_;

    public AAdditionAdsous()
    {
        // Constructor
    }

    public AAdditionAdsous(
        @SuppressWarnings("hiding") PAdsous _adsous_,
        @SuppressWarnings("hiding") TPlus _plus_,
        @SuppressWarnings("hiding") PMultdiv _multdiv_)
    {
        // Constructor
        setAdsous(_adsous_);

        setPlus(_plus_);

        setMultdiv(_multdiv_);

    }

    @Override
    public Object clone()
    {
        return new AAdditionAdsous(
            cloneNode(this._adsous_),
            cloneNode(this._plus_),
            cloneNode(this._multdiv_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAdditionAdsous(this);
    }

    public PAdsous getAdsous()
    {
        return this._adsous_;
    }

    public void setAdsous(PAdsous node)
    {
        if(this._adsous_ != null)
        {
            this._adsous_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._adsous_ = node;
    }

    public TPlus getPlus()
    {
        return this._plus_;
    }

    public void setPlus(TPlus node)
    {
        if(this._plus_ != null)
        {
            this._plus_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._plus_ = node;
    }

    public PMultdiv getMultdiv()
    {
        return this._multdiv_;
    }

    public void setMultdiv(PMultdiv node)
    {
        if(this._multdiv_ != null)
        {
            this._multdiv_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._multdiv_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._adsous_)
            + toString(this._plus_)
            + toString(this._multdiv_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._adsous_ == child)
        {
            this._adsous_ = null;
            return;
        }

        if(this._plus_ == child)
        {
            this._plus_ = null;
            return;
        }

        if(this._multdiv_ == child)
        {
            this._multdiv_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._adsous_ == oldChild)
        {
            setAdsous((PAdsous) newChild);
            return;
        }

        if(this._plus_ == oldChild)
        {
            setPlus((TPlus) newChild);
            return;
        }

        if(this._multdiv_ == oldChild)
        {
            setMultdiv((PMultdiv) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
