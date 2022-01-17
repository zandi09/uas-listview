package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Anjing;
import simple.example.hewanpedia.model.Buaya;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();


    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing(ctx.getString(R.string.ipin), ctx.getString(R.string.ret),
                ctx.getString(R.string.apek), R.drawable.cat_angora));
        kucings.add(new Kucing(ctx.getString(R.string.udin), ctx.getString(R.string.uk),
                ctx.getString(R.string.peak), R.drawable.cat_bengal));
        kucings.add(new Kucing(ctx.getString(R.string.ok), ctx.getString(R.string.nm),
                ctx.getString(R.string.upin), R.drawable.cat_birman));
        kucings.add(new Kucing(ctx.getString(R.string.roy), ctx.getString(R.string.mn),
                ctx.getString(R.string.meme), R.drawable.cat_persia));
        kucings.add(new Kucing(ctx.getString(R.string.isan), ctx.getString(R.string.cg),
                ctx.getString(R.string.mx), R.drawable.cat_siam));
        kucings.add(new Kucing(ctx.getString(R.string.perza), ctx.getString(R.string.cv),
                ctx.getString(R.string.f1), R.drawable.cat_siberian));
        return kucings;
    }

    private static List<? extends Hewan> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing(ctx.getString(R.string.ui), ctx.getString(R.string.as),
                ctx.getString(R.string.sa), R.drawable.dog_bulldog));
        anjings.add(new Anjing(ctx.getString(R.string.zs), ctx.getString(R.string.xz),
                ctx.getString(R.string.cz), R.drawable.dog_husky));
        anjings.add(new Anjing(ctx.getString(R.string.zx), ctx.getString(R.string.zd),
                ctx.getString(R.string.vb), R.drawable.dog_kintamani));
        anjings.add(new Anjing(ctx.getString(R.string.cb), ctx.getString(R.string.bn),
                ctx.getString(R.string.ad), R.drawable.dog_samoyed));
        anjings.add(new Anjing(ctx.getString(R.string.sd), ctx.getString(R.string.ce),
                ctx.getString(R.string.aw), R.drawable.dog_shepherd));
        anjings.add(new Anjing(ctx.getString(R.string.qw), ctx.getString(R.string.df),
                ctx.getString(R.string.gf), R.drawable.dog_shiba));
        return anjings;
    }

    private static List<Buaya> initDataBuaya(Context ctx) {
        List<Buaya> buayas = new ArrayList<>();
        buayas.add(new Buaya(ctx.getString(R.string.xb), ctx.getString(R.string.fg),
                ctx.getString(R.string.nb), R.drawable.buaya_siam));
        buayas.add(new Buaya(ctx.getString(R.string.fh), ctx.getString(R.string.kl),
                ctx.getString(R.string.az), R.drawable.buaya_muara));
        buayas.add(new Buaya(ctx.getString(R.string.qe), ctx.getString(R.string.fj),
                ctx.getString(R.string.kh), R.drawable.buaya_irian));
        buayas.add(new Buaya(ctx.getString(R.string.cn), ctx.getString(R.string.wt),
                ctx.getString(R.string.ty), R.drawable.buaya_gavial));

        return buayas;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataBuaya(ctx));
    }


    public static List<Hewan> getAllHewan (Context ctx){
            if (hewans.size() == 0) {
                initAllHewans(ctx);
            }
            return hewans;
        }

        public static List<Hewan> getHewansByTipe (Context ctx, String  jenis)
        {
            List<Hewan> hewansByType = new ArrayList<>();
            if (hewans.size() == 0) {
                initAllHewans(ctx);
            }
            for (Hewan h : hewans) {
                if (h.getJenis().equals(jenis)) {
                    hewansByType.add(h);
                }
            }
            return hewansByType;
        }

}

