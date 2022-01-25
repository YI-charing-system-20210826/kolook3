<script>
    var target = '#paginate tbody';

    var visible = 25; //最初に表示させる件数

    $(target + ' tr:lt(' + visible + ')').show(); //最初の表示
    $(target + ' tr:gt(' + visible + ')').hide(); //以降は隠す

    //targetの最後の要素が見えたらイベント着火
    $(target + ':last-child').on('inview', function(){
        visible += 100; //次に表示する件数

        $(target + ' tr:lt(' + visible + ')').show(); //隠していた要素を表示
    });
</script>